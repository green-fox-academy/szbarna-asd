package flyable;

public class Helicopter extends Vehicle implements Flyable{

  public Helicopter() {
    this.name = "Helicopter";
    this.horsePower = 1000;
    this.color = "Green";
  }

  public Helicopter(String name, Integer horsePower, String color) {
    super(name, horsePower, color);
  }

  @Override
  public void land() {
    System.out.println("The " + this.color + " " + this.name + " has landed!");
  }

  @Override
  public void takeOff() {
    System.out.println("The " + this.color + " " + this.name + " has taken off");
  }

  @Override
  public void fly() {
    System.out.println("The " + this.color + " " + this.name + " is flying to Valhalla");
  }
}
