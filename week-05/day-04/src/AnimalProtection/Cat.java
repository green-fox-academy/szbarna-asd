package AnimalProtection;

import java.util.Random;

public class Cat extends Animal {
  Random random = new Random();
  private int catHealingCost = random.nextInt(6);

  public Cat() {
    super();
    this.nameOfAnimal = "Cat";
    this.healCost = catHealingCost;
  }

  public Cat(String nameOfAnimal) {
    super(nameOfAnimal);
  }
}
