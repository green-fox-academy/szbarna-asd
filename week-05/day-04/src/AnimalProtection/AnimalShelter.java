package AnimalProtection;

import java.util.ArrayList;
import java.util.Random;

public class AnimalShelter {
  public int budget;
  public ArrayList<Animal> listOfAnimals;
  public ArrayList<String> listOfPotentialAdopters;

  public AnimalShelter() {
    this.budget = 50;
    this.listOfAnimals = new ArrayList<>();
    this.listOfPotentialAdopters = new ArrayList<>();
  }

  public Integer adopt(Animal animal) {
    listOfAnimals.add(animal);
    return listOfAnimals.size();
  }

  public Integer heal() {
    int counter = 0;
    for (Animal animal: listOfAnimals) {
      if (!animal.isHealthy  && budget >= animal.healCost) {
        budget -= animal.healCost;
        animal.isHealthy = true;
        ++counter;
      }
    }
    return counter;
  }

  public void addAdopter(String nameOfAdopter) {
    listOfPotentialAdopters.add(nameOfAdopter);
  }

  public void findNewOwner() {
    ArrayList<Animal> adoptableAnimals = new ArrayList<>();
    for (Animal animal : listOfAnimals) {
      if (animal.isAdoptable()) {
        adoptableAnimals.add(animal);
      }
    }
    Animal randomAnimalToAdopt = adoptableAnimals.get(randomGenerator(adoptableAnimals.size()));
    this.listOfAnimals.remove(randomAnimalToAdopt);
    String owner = this.listOfPotentialAdopters.get(randomGenerator(this.listOfPotentialAdopters.size()));
    randomAnimalToAdopt.setNameOfOwner(owner);
    this.listOfPotentialAdopters.remove(owner);
  }

  public Integer randomGenerator(Integer bound) {
    Random random = new Random();
    return random.nextInt(bound);
  }

  /*public void findOwner() { //újra csinálni;
    for (int i = 0; i < listOfAnimals.size(); i++) {
      for (int j = 0; j < listOfPotentialAdopters.size(); j++) {
        while (!listOfAnimals.get(i).isAdoptable()) {
          listOfAnimals.remove(i);
          listOfPotentialAdopters.remove(j);
        }
        *//*if(listOfAnimals.get(i).isAdoptable()) {
          listOfAnimals.remove(i);
          listOfPotentialAdopters.remove(j);
        }*//*
      }
    }
  }*/

  public Integer earnDonation(Integer amount) {
    return budget += amount;
  }

  public String printDetails() {
    String animalsToString = null;
    for (Animal animal : listOfAnimals) {
      animalsToString += "\n" + animal.toString();
    }
    return animalsToString;
  }

  /*Budget: <budget>€,
   There are <animals.count> animal(s) and <potentionalAdopters.count> potential adopter(s)
   <name> is not healthy (healing would cost: <heal cost> €) and not adoptable
  <name> is healthy and adoptable*/
  public String toString() {
    return "Budget: " + this.budget +"€ \nThere are " + listOfAnimals.size() + " animal(s) and " + listOfPotentialAdopters.size() + "potential adopter(s)" + printDetails();
  }
}
