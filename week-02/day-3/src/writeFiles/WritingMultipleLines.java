package writeFiles;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WritingMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number
    // and is able to write into a file.
    // The path parameter should be a string that describes the location of the file you wish to modify
    // The word parameter should also be a string that will be written to the file as individual lines
    // The number parameter should describe how many lines the file should have.
    // If the word is 'apple' and the number is 5, it should write 5 lines
    // into the file and each line should read 'apple'
    // The function should not raise any errors if it could not write the file.
    try {
      functionWriteLines();
    } catch (Exception e) {
      System.out.println("asgsdf");
    }





    }
  private static void functionWriteLines() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter something!");
    String worldParameter = scanner.nextLine();

    String filePath = "C:\\Users\\riska\\Documents\\greenfox\\szbarna-asd\\week-02\\day-3\\src\\my-file.txt";

    List<String> content = new ArrayList<>();
    content.add(worldParameter);

    for (int i = 0; i < numberParameter ; i++) {
      Files.write(filePath , worldParameter);
    }

  }

}
