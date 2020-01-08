package cloneable;

import java.util.ArrayList;

public class Cohort {
  protected String name;
  protected ArrayList<Student> students;
  protected ArrayList<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }

  public void addMentor (Mentor mentor) {
    this.mentors.add(mentor);
  }

  public String getInfoOfCohort() {
    return "In the Cohort there is/are " + students.size() + " student(s) and " + mentors.size() + " mentor(s)";
  }
}
