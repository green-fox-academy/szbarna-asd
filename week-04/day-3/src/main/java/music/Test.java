package main.java.music;

public class Test {

  public static void main(String[] args) {
    //Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.
    ElectricGuitar guitar = new ElectricGuitar();
    BassGuitar bassGuitar = new BassGuitar();
    Violin violin = new Violin();

    System.out.println("Test 1 Play");
    guitar.play();
    bassGuitar.play();
    violin.play();

    //Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings.
    ElectricGuitar modifiedGuitar = new ElectricGuitar(7);
    BassGuitar modifiedBassGuitar = new BassGuitar(5);

    System.out.println("Test 2 Play");
    modifiedBassGuitar.play();
    modifiedGuitar.play();
  }
}
