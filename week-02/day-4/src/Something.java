import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Something {
  static int WIDTH = 1000;
  static int HEIGHT = 1000;



  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    //A Oldal
    double stepping = 20;
    for (int i = 0; i < HEIGHT; i++) {
      graphics.setColor(new Color(randomGenerator(200), randomGenerator(200), randomGenerator(200)));
      graphics.drawLine((WIDTH/8*3)-i, (HEIGHT/8*3)-i , (WIDTH/8*5)+i , (HEIGHT/8*3)-i);
      i+= stepping;
    }    //B OLdal
    for (int i = 0; i < WIDTH; i++) {
      graphics.setColor(new Color(randomGenerator(200), randomGenerator(200), randomGenerator(200)));
      graphics.drawLine((WIDTH/8*5)+i, (HEIGHT/8*3)-i, (WIDTH/8*5) +i, (HEIGHT/8*5)+i);
      i+=stepping;
    }   //D Odal
    for (int i = 0; i < WIDTH ; i++) {
      graphics.setColor(new Color(randomGenerator(200), randomGenerator(200), randomGenerator(200)));
      graphics.drawLine((WIDTH/8*3)-i , (HEIGHT/8*5)+i, (WIDTH/8*3)-i , (HEIGHT/8*3)-i);
      i+=stepping;
    }    //C Oldal
    for (int i = 0; i < HEIGHT; i++) {
      graphics.setColor(new Color(randomGenerator(200), randomGenerator(200), randomGenerator(200)));
      graphics.drawLine((WIDTH/8*5)+i , (HEIGHT/8*5)+i,(WIDTH/8*3)-i , (HEIGHT/8*5)+i);
      i+=stepping;
    }
  }

  public static int randomGenerator(int bound){
    Random random = new Random();
    return random.nextInt(bound);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    //jFrame.setLocationRelativeTo(null);
    jFrame.setLocation(0,0);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.white);
      mainDraw(graphics);
    }
  }


}
