package flyable;

public abstract class Vehicle {
    protected String name;
    protected Integer horsePower;
    protected String color;

  public Vehicle() {
  }

  public Vehicle(String name, Integer horsePower, String color) {
    this.name = name;
    this.horsePower = horsePower;
    this.color = color;
  }
}
