
package counter;

public class Counter {

  private Integer counter;
  private Integer reset;
  private Integer initialValue;

  public Counter() {
    counter = 0;
    initialValue = counter;
  }
  public Counter(Integer counter) {
    this.counter = counter;
    this.initialValue = counter;
  }
  public void add() {
    ++counter;
  }
  public void add(Integer number) {
    counter += number;
  }
  public Integer get() {
    return counter;
  }
  public void reset() {
    this.counter = initialValue;
  }
  public void print() {
    System.out.println("The value of the counter is: " + counter);
  }
}
