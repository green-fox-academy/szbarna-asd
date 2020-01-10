package sumTest;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import sum.Sum;
import static org.junit.jupiter.api.Assertions.*;

public class SumTest {

  private Sum getSum;

  @Before
  public void initialize(){
   getSum = new Sum();
  }

  @Test
  public void sumTest() {
    ArrayList<Integer> random = new ArrayList();
    random.add(10);
    random.add(5);
    random.add(15);

    assertEquals(30, getSum.sum(random));
  }

  @Test
  public void sumTestInCaseOfNoElements() {
    ArrayList<Integer> random = new ArrayList();

    assertEquals(0, getSum.sum(random));
  }

  @Test
  public void sumTestWithOneElement() {
    ArrayList<Integer> random = new ArrayList();
    random.add(10);

    assertEquals(10, getSum.sum(random));
  }
  @Test
  public void sumTestWithNull() {
    ArrayList<Integer> random = new ArrayList();
    random.add(null);
    random.add(11);

    assertEquals(11, getSum.sum(random));
  }

}
