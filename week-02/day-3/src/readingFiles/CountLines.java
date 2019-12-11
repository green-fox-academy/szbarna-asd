package readingFiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class CountLines {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("Give me the name of the file: "); //Scanner adás bumm

      String fileName = sc.nextLine(); //az inputot hozzáadjuk egy változóhoz
      Long numberOfLInes = Files.lines(Paths.get(fileName)).count(); //létrehozunk egy String változót
      System.out.println(numberOfLInes);                              //ami a fájl soraiva lesz egyenlő
    } catch (Exception e) {                                           //és ebben adtuk meh a path-ot is
      System.out.println("0 The file can't be found");
    }
  }
}
