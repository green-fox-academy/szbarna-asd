package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(Integer numberOfStrings) {
    super(numberOfStrings);
    this.name = "Bass Guitar";
  }

  public BassGuitar() {
    this.numberOfStrings = 4;
    this.name = "Bass Guitar";
  }

  @Override
  public String sound() {

    return "goes Duum-duum-duum";
  }
  //Bass Guitar, a 4-stringed instrument that goes Duum-duum-duum

  @Override
  public void play() {

    System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + this.sound());
  }
}
