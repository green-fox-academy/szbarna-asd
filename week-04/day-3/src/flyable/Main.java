package flyable;

public class Main {

  public static void main(String[] args) {
    Helicopter helicopter = new Helicopter();
    Helicopter apache = new Helicopter("Apache", 2000, "Black");
    Bird bird = new Bird();
    Bird fecske = new Bird("Fecske", "Black");

    helicopter.takeOff();
    helicopter.fly();
    helicopter.land();
    apache.takeOff();
    apache.fly();
    apache.land();
    System.out.println("------------------");
    bird.takeOff();
    bird.fly();
    bird.land();
    fecske.takeOff();
    fecske.fly();
    fecske.land();
  }
}
