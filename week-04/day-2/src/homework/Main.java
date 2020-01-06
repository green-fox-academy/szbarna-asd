package homework;

public class Main {

  public static void main(String[] args) {
    Person person1 = new Person("Jane Doe", 30, "female");
    Student student1 = new Student("Jane Doe",30, "female", "The School Of Life", 0);
    Mentor mentor1 = new Mentor("Jane Doe", 30, "female", "intermediate");

    System.out.println(person1.introduce() + " " + person1.getGoal());
    System.out.println(student1.introduce() + " " + student1.getGoal());
    System.out.println(mentor1.introduce() + " " + mentor1.getGoal());


  }
}
