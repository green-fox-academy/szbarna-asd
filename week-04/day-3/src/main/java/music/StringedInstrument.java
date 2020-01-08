package main.java.music;

public abstract class StringedInstrument extends Instrument {
  protected Integer numberOfStrings;

  public StringedInstrument(Integer numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument() {

  }

  public abstract String sound();

}
