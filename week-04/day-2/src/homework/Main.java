package homework;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();
    ArrayList<Sponsor> sponsors = new ArrayList<>();

    Person person1 = new Person("Mark", 46, "male");
    people.add(person1);
    Person person2 = new Person();
    people.add(person2);
    Student student1 = new Student("John Doe",20, "male", "BME", 0);
    students.add(student1);
    Student student2 = new Student();
    students.add(student2);
    Mentor mentor1 = new Mentor("Gandhi", 148, "male", "senior");
    mentors.add(mentor1);
    Mentor mentor2 = new Mentor();
    mentors.add(mentor2);
    Sponsor sponsor1 = new Sponsor("Elon Mask", 46, "male", "SpaceX", 0);
    sponsors.add(sponsor1);
    Sponsor sponsor2 = new Sponsor();
    sponsors.add(sponsor2);

    /*System.out.println(person1.introduce() + " " + person1.getGoal());
    System.out.println(student1.introduce() + " " + student1.getGoal());
    System.out.println(mentor1.introduce() + " " + mentor1.getGoal());
    System.out.println(sponsor1.introduce() + " " + sponsor1.getGoal());

    System.out.println("--------------");

    System.out.println("No. of people: " + people.size() + " number of students: " + students.size() + " number of mentors: " + mentors.size() + " number of sponsors: " + sponsors.size());*/
    student1.skipDays(3);

    for (int i = 0; i < 5; i++) {
      sponsor2.hire();
    }

    for (int i = 0; i < 3; i++) {
      sponsor1.hire();
    }

    for (Person person : people) {
      person.introduce();
      person.getGoal();
    }

    for (Student person : students) {
      person.introduce();
      person.getGoal();
    }

    for (Mentor person : mentors) {
      person.introduce();
      person.getGoal();
    }

    for (Sponsor person : sponsors) {
      person.introduce();
      person.getGoal();
    }
  }
}
