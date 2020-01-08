package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(Integer numberOfStrings) {
    super(numberOfStrings);
    this.name = "Violin";
  }

  public Violin() {
    this.numberOfStrings = 4;
    this.name = "Violin";
  }

  @Override
  public String sound() {

    return "goes Screech";
  }
  //Violin, a 4-stringed instrument that goes Screech

  @Override
  public void play() {
    System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + this.sound());
  }
}
