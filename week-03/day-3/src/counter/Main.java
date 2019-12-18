package counter;

public class Main {

  public static void main(String[] args) {
  Counter counter1 = new Counter();
  Counter counter2 = new Counter(40);

  counter1.print();
  counter2.print();

  counter1.add();
  counter2.add();
  counter1.print();
  counter2.print();

  counter1.reset();
  counter2.reset();
  counter1.print();
  counter2.print();
  }
}
