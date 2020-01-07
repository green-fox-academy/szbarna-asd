package gardenApplication;

public class Tree extends Plant {

  public Tree(String color) {
    super(color);
  }

  @Override
  public void watering(Double waterAmount) {
    if (this.waterLevel <= 10) {
      this.waterLevel += waterAmount * 0.4;
    }
  }

}

