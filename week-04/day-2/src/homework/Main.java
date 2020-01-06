package homework;

public class Main {

  public static void main(String[] args) {
    Person person1 = new Person("Jane Doe", 30, "female");
    Student student1 = new Student("Jane Does",30, "female", "The School Of Life", 0);

    System.out.println(person1.introduce() + " " + person1.getGoal());
    System.out.println(student1.introduce() + " " + student1.getGoal());

  }
}
