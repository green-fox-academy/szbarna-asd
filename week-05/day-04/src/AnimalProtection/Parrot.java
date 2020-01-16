package AnimalProtection;

import java.util.Random;

public class Parrot extends Animal {
  Random random = new Random();
  private int parrotHealthCost = random.nextInt(6) + 4;

  public Parrot() {
    super();
    this.nameOfAnimal = "Parrot";
    this.healCost = parrotHealthCost;
  }

  public Parrot(String nameOfAnimal) {
    super(nameOfAnimal);
  }
}
