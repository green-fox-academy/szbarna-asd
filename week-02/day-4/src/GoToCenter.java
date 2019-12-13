import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from the point to the center of the canvas.
    // Draw at least 3 lines with that function using a loop.
    Random random = new Random();
    int numberOfLines = 4;
    for (int i = 0; i < numberOfLines; i++) {
      int x = random.nextInt(HEIGHT);
      int y = random.nextInt(WIDTH);
    }
    int y = 0;
    int x = 0;
    drawLine(graphics, x ,y);




  }
  private static void drawLine(Graphics graphics, int x, int y) {
    graphics.drawLine(HEIGHT / 2, WIDTH / 2, x, y);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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