package gardenApplication;

public class Tree extends Plant {

  public Tree(String color) {
    super(color);
    this.absorptionIndex = 0.4;
  }

  @Override
  public void getInfo() {
    if (this.waterLevel < 10) {
      System.out.println("The " + this.color + " tree need water!");
    } else {
      System.out.println("The " + this.color + " tree doesn't need water!");
    }

  }

  @Override
  public void watering(Double waterAmount) {
    if (this.waterLevel < 10) {
      this.waterLevel += waterAmount * absorptionIndex;
    }
  }

}

