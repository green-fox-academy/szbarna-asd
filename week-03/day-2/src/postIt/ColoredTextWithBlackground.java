package postIt;

import java.awt.Color;

public class ColoredTextWithBlackground {
  /*Create a PostIt class that has
      a backgroundColor
      a text on it
      a textColor
      Create a few example post-it objects:
  an orange with blue text: "Idea 1"
  a pink with black text: "Awesome"
  a yellow with green text: "Superb!"*/
  public static void main(String[] args) {
    Text text1 = new Text("Idea 1", "Blue", "Orange");
    Text text2 = new Text("Awesome", "Black", "Pink");
    Text text3 = new Text("Superb!", "Green", "Yellow");
    //Tree tree1 = new Tree("Bukk", new Color(), 15, "Male");
    text1.print();
    text2.print();
    text3.print();
  }

}
