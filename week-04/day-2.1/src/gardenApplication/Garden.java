package gardenApplication;

import greenFoxOrganization.Student;
import java.util.ArrayList;

public class Garden {
  protected ArrayList<Plant> plants;

  public Garden() {
   this.plants = new ArrayList<>();
  }
  public void addPlants(Plant plant) {
    this.plants.add(plant);
  }
}
