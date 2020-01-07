package greenFoxOrganization;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();

    Student basicStudent = new Student();
    people.add(basicStudent);
    Student bela = new Student("Bela", 20, "male", "BME");
    people.add(bela);
    Mentor basicMentor = new Mentor();
    people.add(basicMentor);
    Mentor johny = new Mentor("Johny" , 27, "male", "Intermediate");
    people.add(johny);
    Sponsor basicSponsor = new Sponsor();
    people.add(basicSponsor);
    Sponsor elon = new Sponsor("Elon Musk", 40, "Male", "SpaceX");
    people.add(elon);

    basicStudent.skipDays(4);
    bela.skipDays(10);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }

    for (int i = 0; i < 3; i++) {
      basicSponsor.hire();
    }

    for (Person person : people) {
      System.out.println(person.introduce());
      System.out.println(person.getGoal());
    }

    System.out.println("----------------------------------");

    Cohort awesome = new Cohort("AWESOME");
    awesome.addStudent(basicStudent);
    awesome.addStudent(bela);
    awesome.addMentor(basicMentor);
    awesome.addMentor(johny);

    System.out.println(awesome.getInfoOfCohort());
  }
}
