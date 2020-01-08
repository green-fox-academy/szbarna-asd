package cloneable;

  public class Student extends Person {
    protected String previousOrganization;
    protected Integer skippedDays;

    @Override
    public Student clone() {
      return this;
    }

    public Student() {
      super();
      this.previousOrganization = "The School Of Life";
      this.skippedDays = 0;
    }

    public Student(String name, Integer age, String gender, String previousOrganization) {
      super(name, age, gender);
      this.previousOrganization = previousOrganization;
      this.skippedDays = 0;
    }

    @Override
    public String introduce() {
      return super.introduce() + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.";
    }

    @Override
    public String getGoal() {
      return super.myGoalIs + "Be a junior software developer.";
    }

    public Integer skipDays(Integer numberOfDays) {
      return this.skippedDays += numberOfDays;
    }
  }
