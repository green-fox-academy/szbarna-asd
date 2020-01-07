package gardenApplication;

public class Plant {
  protected String color;
  protected Double waterLevel;
  protected Double waterAmount;

  public Plant(String color) {
    this.color = color;
    this.waterLevel = 0.0;
  }

  public void watering(Double waterAmount) {
    this.waterAmount += waterAmount;
    System.out.println("Watering with " + waterAmount);
  }

  public void getInfo() {
  }
}
