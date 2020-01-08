package cloneable;

public class Sponsor extends Person {
  protected String company;
  protected Integer hiredStudents;

  public Sponsor(String name, Integer age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  @Override
  public Sponsor clone() {
    return this;
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }

  @Override
  public String introduce() {
    return super.introduce() + " who represents " + company +  " and hired " + hiredStudents + " students so far.";
  }

  @Override
  public String getGoal() {
    return super.myGoalIs + "Hire brilliant junior software developers.";
  }

  public void hire() {
    ++this.hiredStudents;
  }
}