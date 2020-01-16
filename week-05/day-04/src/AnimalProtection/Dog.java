package AnimalProtection;

import java.util.Random;

public class Dog extends Animal{
  Random random = new Random();
  private int dogHealthCost = random.nextInt(7) + 1;


  public Dog(String nameOfAnimal) {
    super(nameOfAnimal);
  }

  public Dog() {
    super();
    this.healCost = dogHealthCost;
    this.nameOfAnimal = "Dog";
  }
}
