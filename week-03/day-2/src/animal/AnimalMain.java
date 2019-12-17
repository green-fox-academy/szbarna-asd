package animal;

public class AnimalMain {

  public static void main(String[] args) {
    int basicHunger = 50;
    int basicThirst = 50;
    int levelOfDeath = 100;
    Animal tiger = new Animal("Tiger", basicHunger, basicThirst);
    Animal elephant = new Animal("Elephant", basicHunger, basicThirst);
    Animal giraffe = new Animal("Giraffe", basicHunger, basicThirst);
    Animal duck = new Animal("Duck", basicHunger, basicThirst);

    /*System.out.println("State of animals before doing any activities: ");
    tiger.print();
    elephant.print();
    giraffe.print();
    duck.print();*/

    tiger.eat();
    tiger.drink();
    tiger.print();
    tiger.play();
    tiger.print();
    //etc....

  }
}
