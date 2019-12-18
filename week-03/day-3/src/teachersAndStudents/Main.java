package teachersAndStudents;

public class Main {

  public static void main(String[] args) {
    Students student1 = new Students();
    Teachers teacher1 = new Teachers();

    student1.question(teacher1);
    teacher1.teach(student1);

  }

}
