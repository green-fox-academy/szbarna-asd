package gardenApplication;

public class Main {

  public static void main(String[] args) {
    Tree tree1 = new Tree("Blue");
    Flower flower1 = new Flower("yellow");

    tree1.getInfo();
    flower1.getInfo();
    System.out.println("----------");

    tree1.watering(30.0);
    flower1.watering(10.0);


    tree1.getInfo();
    flower1.getInfo();
    System.out.println("----------");

    tree1.watering(5.3);


    tree1.getInfo();
    flower1.getInfo();
    System.out.println(flower1.waterLevel);
    System.out.println(tree1.waterLevel);
  }
}
