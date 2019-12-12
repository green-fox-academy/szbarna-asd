
import java.util.HashMap;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
  static int WIDTH = 500;
  static int HEIGHT = 500;


  public static void mainDraw(Graphics graphics) {
    // Draw the canvas' diagonals.
    // If it starts from the upper-left corner it should be green, otherwise it should be red.
    int xStart = 0;
    int yStart = 0;
    int xEnd = 0;
    int yEnd = 0;


    graphics.drawLine(xStart, yStart, xEnd, yEnd);

    /*  while (xStart ==0 && yStart ==0) {
      graphics.setColor(Color.red);
      graphics.drawLine(xStart, yStart, xEnd, yEnd);
    } else {
      graphics.setColor(Color.green);
    }*/



    //graphics.drawLine(0, WIDTH, 0HEIGHT, 0);
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
