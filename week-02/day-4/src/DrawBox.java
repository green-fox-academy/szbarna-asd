import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawBox {
  static int WIDTH = 1000;
  static int HEIGHT = 1000;

  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    graphics.setColor(Color.black);
    graphics.drawLine(WIDTH/4 , HEIGHT/4 , WIDTH/4*3 , HEIGHT/4);

    graphics.setColor(Color.white);
    graphics.drawLine(WIDTH/4*3 , HEIGHT/4 , WIDTH/4*3 , HEIGHT/4*3);

    graphics.setColor(Color.black);
    graphics.drawLine(WIDTH/4*3 , HEIGHT/4*3 ,WIDTH/4 , HEIGHT/4*3);

    graphics.setColor(Color.white);
    graphics.drawLine(WIDTH/4 , HEIGHT/4*3, WIDTH/4 , HEIGHT/4);



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
      this.setBackground(Color.gray);
      mainDraw(graphics);
    }
  }


}
