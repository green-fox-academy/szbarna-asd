package greenFoxOrganization;

public class Mentor extends Person {
  protected String level;

  public Mentor(String name, Integer age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level = "intermediate";
  }

  @Override
  public String introduce() {
    return super.introduce() + " " + this.level + " level mentor.";
  }

  @Override
  public String getGoal() {
    return super.myGoalIs + "Educate brilliant junior software developers.";
  }

}
