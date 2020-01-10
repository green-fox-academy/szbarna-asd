import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListingOfTasks {

  public void showMyTasks() throws FileNotFoundException {
    File toDoTxt = new File("C:\\Users\\riska\\Documents\\greenfox\\szbarna-asd\\week-04\\day-5\\src\\toDo.txt");
    Scanner sc = new Scanner(toDoTxt);

    if (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
    } else {
      System.out.println("Your ToDo list is empty!");
    }
  }
}
