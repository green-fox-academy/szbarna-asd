package postIt;

public class Text {
  private String txtColor;
  private String txtBackgroundColor;
  private String text;

  public Text( String text, String txtColor, String txtBackgroundColor) {
    this.txtColor = txtColor;
    this.txtBackgroundColor = txtBackgroundColor;
    this.text = text;
  }
  public void print() {
    System.out.println("The text: " + text + ". The color of text: " + txtColor + ". The background color of the text: " + txtBackgroundColor + ".");
  }
}
