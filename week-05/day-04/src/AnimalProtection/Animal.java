package AnimalProtection;

public class Animal {
  String nameOfAnimal;
  String nameOfOwner;
  boolean isHealthy;
  int healCost;

  public void setNameOfOwner(String nameOfOwner) {
    this.nameOfOwner = nameOfOwner;
  }

  public Animal() {
    this.isHealthy = false;
  }

  public Animal(String nameOfAnimal) {
    this.nameOfAnimal = nameOfAnimal;
    this.isHealthy = false;
  }

  public void setHealthy(boolean healthy) {
    isHealthy = healthy;
  }

  public void heal() {
      this.isHealthy = true;
  }

  public boolean isAdoptable() {
    if(this.isHealthy) {
      return true;
    } else {
      return false;
    }
  }
  public String toString() {
    if (this.isAdoptable()) {
      return this.nameOfAnimal + " is healthy, and adoptable";
    } else {
      return this.nameOfAnimal + " is not healthy (the heal cost: " + healCost + "€), and not adoptable";
    }
  }
}
