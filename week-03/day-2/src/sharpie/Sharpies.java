package sharpie;

class Sharpie {
  /*Create Sharpie class
  We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
  When creating one, we need to specify the color and the width
  Every sharpie is created with a default 100 as inkAmount
  We can use() the sharpie objects
  which decreases inkAmount*/
  private String colorOfSharpie;
  private Float widthOfSharpie;
  private Float inkAmountOfSharpie;

  public Sharpie(String colorOfSharpie, Float widthOfSharpie) {
    this.colorOfSharpie = colorOfSharpie;
    this.widthOfSharpie = widthOfSharpie;
    this.inkAmountOfSharpie = 100f;
  }
  public void sharpie() {
    --inkAmountOfSharpie;
  }
  public void print() {
    System.out.println("Color of Sharpie:" + colorOfSharpie + ". Width of Sharpie: " + widthOfSharpie + ". Remaining amount of Sharpie's ink is:" + inkAmountOfSharpie);
  }
}
