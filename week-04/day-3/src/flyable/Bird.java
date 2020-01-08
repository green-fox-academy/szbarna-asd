package flyable;

public class Bird extends Animal implements Flyable{

  public Bird(String name, String color) {
    super(name, color);
  }

  public Bird() {
    this.name = "Bird";
    this.color = "Pink";
  }

  @Override
  public void land() {
    System.out.println("The " + this.color + " " + this.name + " sitting on a branch");
  }

  @Override
  public void takeOff() {
    System.out.println("The " + this.color + " " + this.name + " has left the branch");
  }

  @Override
  public void fly() {
    System.out.println("The " + this.color + " " + this.name + " slapping it's wings");
  }
}
