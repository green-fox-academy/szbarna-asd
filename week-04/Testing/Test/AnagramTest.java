import apples.AppleMain;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

  private Anagram test;

  @Before
  public void initialize() {
    test = new Anagram();

  }

  @Test
  public void anagramTest() {
    String a = "asdfghjkl";
    String b = "adgjlkhfs";

    assertTrue(Anagram.isAnagram(a, b));
  }

  @Test
  public void anagramTestWithUpperCase() {
    String a = "ASDFGHJ";
    String b = "AsDfGhJ";
    assertTrue(Anagram.isAnagram(a, b));
  }

  @Test
  public void anagramTestWithSpecialChar() {
    String a = "asdfghj*kl";
    String b = "adgj*lkhfs";

    assertTrue(Anagram.isAnagram(a, b));
  }

  @Test
  public void anagramTestWithNumbers() {
    String a = "A4SD5FG1HJ";
    String b = "As4DfG51hJ";
    assertTrue(Anagram.isAnagram(a, b));
  }

}
