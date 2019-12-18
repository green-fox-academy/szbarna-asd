package teachersAndStudents;

public class Students {
  /*Student
  learn() -> prints the student is learning something new
  question(teacher) -> calls the teachers answer method*/
  private String student;

  public void Student() {
    this.student = student;
  }
  public void learn() {
    System.out.println("That's not the answer of my question!");
  }
  public void question(Teachers teacher) {
    System.out.println("I have a question!");
    teacher.answer();

  }
}
