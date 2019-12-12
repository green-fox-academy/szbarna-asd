import java.util.HashMap;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DiagonalsBVersion {
  static int WIDTH = 500;
  static int HEIGHT = 500;


  public static void mainDraw(Graphics graphics) {
    // Draw the canvas' diagonals.
    // If it starts from the upper-left corner it should be green, otherwise it should be red.
    for (int i = 0; i < WIDTH; i += 100) {
      //graphics.setColor(new Color(randomGenerator(100), randomGenerator(120), randomGenerator(100)));
      graphics.drawLine(0 + i, 0, WIDTH - i, HEIGHT);
    }
    for (int i = 0; i < HEIGHT; i += 10) {
      graphics.setColor(new Color(randomGenerator(256), randomGenerator(120), randomGenerator(100)));
      graphics.drawLine(0, 0 + i, WIDTH, HEIGHT - i);
      if(i == 0){
        graphics.setColor(Color.green);
        graphics.drawLine(0, 0, WIDTH, HEIGHT);
      }
    }
  }
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
      this.setBackground(Color.white);
      mainDraw(graphics);
    }
  }


}

