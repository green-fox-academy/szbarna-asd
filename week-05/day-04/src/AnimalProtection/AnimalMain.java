package AnimalProtection;

import java.util.ArrayList;

public class AnimalMain {

  public static void main(String[] args) {
    AnimalShelter animalShelter = new AnimalShelter();
    Dog dog1 = new Dog();
    Dog dog2 = new Dog("Morzsi");
    dog2.setHealthy(true);
    Cat cat1 = new Cat();
    cat1.setHealthy(true);
    Cat cat2 = new Cat("Cirmos");
    Parrot parrot1 = new Parrot();
    Parrot parrot2 = new Parrot("Parry");
    parrot2.setHealthy(true);

    animalShelter.adopt(cat2);
    animalShelter.adopt(cat1);
    animalShelter.adopt(dog1);
    animalShelter.adopt(dog2);
    animalShelter.adopt(parrot1);
    animalShelter.adopt(parrot2);

    System.out.println(animalShelter.toString());
    System.out.println("------------------");
    //System.out.println(animalShelter.heal());
    animalShelter.earnDonation(100);


    System.out.println(animalShelter.toString());
    System.out.println("------------------");

    animalShelter.addAdopter("Kate");
    animalShelter.addAdopter("Mark");
    animalShelter.addAdopter("Bob");
    animalShelter.addAdopter("Jesus");
    System.out.println(animalShelter.toString());

    animalShelter.findNewOwner();

    System.out.println(animalShelter.toString());

    System.out.println(dog1.nameOfOwner);
    System.out.println(dog2.nameOfOwner);
    System.out.println(cat1.nameOfOwner);
    System.out.println(cat2.nameOfOwner);
    System.out.println(parrot1.nameOfOwner);
    System.out.println(parrot2.nameOfOwner);

   /* System.out.println(parrot1.isAdoptable());
    System.out.println(parrot1.toString());
    parrot1.heal();
    System.out.println(parrot1.isAdoptable());
    System.out.println(parrot1.toString());*/

  }

}
