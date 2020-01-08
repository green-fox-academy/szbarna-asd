package main.java.music;

public class ElectricGuitar extends StringedInstrument {


  public ElectricGuitar(Integer numberOfStrings) {
    super(numberOfStrings);
    this.name = "Electric Guitar";
  }

  public ElectricGuitar() {
    this.numberOfStrings = 6;
    this.name = "Electric Guitar";
  }

  @Override
  public String sound() {

   return "goes Twang";
  }

  @Override
  public void play() {

    System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + this.sound());
    //Electric Guitar, a 6-stringed instrument that goes Twang
  }
}
