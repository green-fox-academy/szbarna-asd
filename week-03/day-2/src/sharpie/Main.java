package sharpie;

public class Main {

  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("Black", 10f);
    Sharpie sharpie2 = new Sharpie("Red", 20f);

    System.out.println("Details of Sharpies before using them:");
    sharpie1.print();
    sharpie2.print();

    sharpie1.sharpie();
    sharpie2.sharpie();
    System.out.println("Details after using them:");
    sharpie1.print();
    sharpie2.print();
  }
}
