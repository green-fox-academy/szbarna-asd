import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;

public class Anagram {

  public static void main(String[] args) {
    String a = "asd";
    String b = "dsa";

    System.out.println(isAnagram(a, b));
  }

  public static boolean isAnagram (String input1, String input2) {
    return charOrderMaker(input1).equals(charOrderMaker(input2));

  }

  public static String charOrderMaker(String input) {
    String charOrder;

    char[] charArray = input.toLowerCase().toCharArray();

    Arrays.sort(charArray);

    charOrder = new String(charArray);

    return charOrder;
  }
}
