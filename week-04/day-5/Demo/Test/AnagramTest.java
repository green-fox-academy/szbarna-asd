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
    String a = "heavyrain";
    String b = "hireanavy";

    assertTrue(Anagram.isAnagram(a, b));
  }

  @Test
  public void anagramTestWithUpperCase() {
    String a = "MOTHER IN LAW";
    String b = "woman hitler";
    assertTrue(Anagram.isAnagram(a, b));
  }

  @Test
  public void anagramTestWithSpecialChar() {
    String a = "W a i t r e s s!!";
    String b = "A stew, Sir?";

    assertTrue(Anagram.isAnagram(a, b));
  }

  @Test
  public void anagramTestWithNumbers() {
    String a = "Tom Cruise 66";
    String b = "So I'm cuter";
    assertTrue(Anagram.isAnagram(a, b));
  }

}
