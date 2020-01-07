package gardenApplication;

public class Flower extends Plant {

  public Flower(String color) {
    super(color);
    this.absorptionIndex = 0.75;
  }

  @Override
  public void getInfo() {
    if (this.waterLevel < 5) {
      System.out.println("The " + this.color + " flower need water!");
    } else {
      System.out.println("The " + this.color + " flower doesn't need water!");
    }
  }

  @Override
  public void watering(Double waterAmount) {
    if (this.waterLevel < 5) {
      this.waterLevel += waterAmount * absorptionIndex;
    }
  }
}
