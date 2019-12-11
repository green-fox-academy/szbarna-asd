package writeFiles;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WritingSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"
    Scanner scanner = new Scanner(System.in);
    List<String> content = new ArrayList<>();
    System.out.println("Please give me your name:");

    String yourName = scanner.nextLine();
    content.add(yourName);
    try {
      Path filePath = Paths.get("C:/Users/riska/Documents/greenfox/szbarna-asd/week-02/day-3/src/writeFiles/my-file.txt");
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
