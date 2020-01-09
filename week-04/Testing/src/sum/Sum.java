package sum;

import java.util.ArrayList;

public class Sum {

  public static void main(String[] args) {

  }

  public int sum(ArrayList<Integer> numbers) {
    int temp = 0;
    for (Integer number : numbers) {
      if (number != null) {
        temp += number;
      }
    }
    return temp;
  }
}
