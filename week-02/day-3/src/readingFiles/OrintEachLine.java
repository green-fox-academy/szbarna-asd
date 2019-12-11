package readingFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class OrintEachLine {

  public static void main(String[] args) {
    try {
      Path myFilePath = Paths.get("C:/Users/riska/Documents/greenfox/my-file.txt"); //meghívjuk a fájlt jelen esetben abszolút pathhal
      Files.readAllLines(myFilePath.toAbsolutePath()).forEach(System.out::println); // megmodjuk, hogy olvassa el a fájlt és hozzáadunk egy foreach loopot, hogy kinyomtassa
    } catch (IOException e) {
      System.out.println("Unable to read file: my-file.txt"); //exceptiont adunk, ha esetleg nem éri el a fájlt (törölt, nem létezik)
    }
  }
}
