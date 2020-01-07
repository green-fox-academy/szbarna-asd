package gardenApplication;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Plant> plants = new ArrayList<>();

    Tree tree1 = new Tree("Blue");
    plants.add(tree1);
    Flower flower1 = new Flower("yellow");
    plants.add(flower1);

    for (Plant plant : plants) {
      plant.getInfo();
    }

  }
}
