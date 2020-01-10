import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;

public class Anagram {

  public static String splitString(String input) {
    StringBuffer alpha = new StringBuffer();

    for (int i=0; i<input.length(); i++)
    {
      if(Character.isAlphabetic(input.charAt(i)))
        alpha.append(input.charAt(i));
    }
    String alphaToString = alpha.toString();

    return alphaToString;
  }

  public static String charOrderMaker(String afterSplit) {
    String charOrder;

    char[] charArray = afterSplit.toLowerCase().toCharArray();

    Arrays.sort(charArray);

    charOrder = new String(charArray);

    return charOrder;
  }

  public static boolean isAnagram (String input1, String input2) {
    return charOrderMaker(splitString(input1)).equals(charOrderMaker(splitString(input2)));
  }



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a word");
    String inputWord1 = scanner.nextLine();
    System.out.println("Please enter another word");
    String inputWord2 = scanner.nextLine();

    if (isAnagram(inputWord1, inputWord2)) {
      System.out.println("They are Anagrams");
    } else {
      System.out.println("They are not Anagrams");
    }
  }
}