package gardenApplication;

public class Plant {
  protected String color;
  protected Double waterAmount;
  protected Double waterLevel;

  public Plant(String color) {
    this.color = color;
    this.waterLevel = 0.0;
  }

  public void watering(Double waterAmount) {
    this.waterAmount += waterAmount;
  }
}
