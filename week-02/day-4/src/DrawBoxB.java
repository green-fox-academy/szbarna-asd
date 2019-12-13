import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawBoxB {
  static int WIDTH = 1000;
  static int HEIGHT = 1000;


  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    for (int i = 0; i < HEIGHT/8; i++) {
      graphics.setColor(Color.black);
      graphics.drawLine(WIDTH/8*3+i, HEIGHT/8*3+i , WIDTH/8*5+i , HEIGHT/8*3+i);
    }
    for (int i = 0; i < WIDTH/8; i++) {
      graphics.setColor(Color.white);
      graphics.drawLine(WIDTH/8*5 +i, HEIGHT/8*3+i , WIDTH/8*5 +i, HEIGHT/8*5+i);
    }
    for (int i = 0; i < WIDTH/8 ; i++) {
      graphics.setColor(Color.white);
      graphics.drawLine(WIDTH/8*3+i , HEIGHT/8*5+i, WIDTH/8*3+i , HEIGHT/8*3+i);
    }
    for (int i = 0; i < HEIGHT/8; i++) {
      graphics.setColor(Color.black);
      graphics.drawLine(WIDTH/8*5+i , HEIGHT/8*5+i,WIDTH/8*3+i , HEIGHT/8*5+i);
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
      this.setBackground(Color.gray);
      mainDraw(graphics);
    }
  }


}
