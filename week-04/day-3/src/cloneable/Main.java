package cloneable;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();


    Student lofasz = new Student("Lófasz", 20, "male", "BME");
    Person person = new Person();
    Person personTheClone = person.clone();
    System.out.println(person.clone().age);
    Student lofaszTheClone = lofasz.clone();
    people.add(lofaszTheClone);
    people.add(lofasz);
    System.out.println(lofaszTheClone.name);
    System.out.println(people.size());


  }
}