import java.util.HashMap;

public class CountLetters {

  public static void main(String[] args) {
    System.out.println(lettersInHashMap("carcarcarcar"));
  }

  public static HashMap<Character, Integer> lettersInHashMap (String word) {
      HashMap<Character, Integer> words = new HashMap<Character, Integer>();
      for (int i = 0; i < word.length(); i++) {
        char letter = (word.charAt(i));
        int counter = words.get(letter);

        if(words.containsKey(letter)){
          words.put(letter,++counter);
        }else {
          words.put(letter, 1);
        }
      }return words;
    }
}
