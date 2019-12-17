package animal;

public class Animal {
  /*Create an Animal class
  Every animal has a hunger value, which is a whole number
  Every animal has a thirst value, which is a whole number
  when creating a new animal object these values are created with the default 50 value
  Every animal can eat() which decreases their hunger by one
  Every animal can drink() which decreases their thirst by one
  Every animal can play() which increases both by one*/
  private int hungerValue;
  private int thirstValue;
  private String animalType;

  public Animal(String animalType, int hungerValue, int thirstValue) {
    this.animalType = animalType;
    this.hungerValue = hungerValue;
    this.thirstValue = thirstValue;
  }
  public void print(){
    System.out.println("Type of animal: " + this.animalType + " Level of hunger: " + this.hungerValue + " Level of thirst: " + this.thirstValue);
  }


  public void eat() {
    --hungerValue;
  }
  public void drink() {
    --thirstValue;
  }
  public void play() {
      ++hungerValue;
      ++thirstValue;
  }
}
/*
package Animal;

public class Animal {

  private String animalName;
  private Integer hunger;
  private Integer thirst;


  public Animal(String animalName, Integer hunger, Integer thirst){
    this.animalName = animalName;
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat(){
    this.hunger--;
  }

  public void drink(){
    this.thirst--;
  }

  public void play(){
    this.hunger++;
    this.thirst++;
  }

  public void print(){
    System.out.println(animalName + " hunger: " + hunger + ", thirst: " + thirst);
  }

}*/
