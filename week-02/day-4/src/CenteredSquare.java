import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

  public static void mainDraw(Graphics graphics) {
    double stepping = 1;
    for (int i = 0; i < WIDTH/2; i++) {
      graphics.setColor(new Color( randomGenerator(200), randomGenerator(200), randomGenerator(200)));
      graphics.drawOval((WIDTH/4), (HEIGHT/4), 200+i, 200+i);
      i += stepping;
    }




  }
  /*public static int randomGenerator(int bound){
    Random random = new Random();
    return random.nextInt(bound);
  }*/
  public static int randomGenerator (int colors) {
    Random random = new Random();
    return random.nextInt(colors);
  }

  // Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = 1000;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}