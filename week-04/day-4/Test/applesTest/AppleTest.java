package applesTest;

import apples.AppleMain;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppleTest {

  private AppleMain main;

  @Before
  public void initialize(){
    main = new AppleMain();
  }

  @Test
  public void addTest() {
    assertEquals("apple", main.getApple());
  }

}
