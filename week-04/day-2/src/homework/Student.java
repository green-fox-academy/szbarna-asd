package homework;

public class Student {
  private String name;
  private Integer age;
  private String gender;
  private String goal;
  private String previousOrganization;
  private Integer skippedDays = 0;

  public String introduce() {
    return "Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.";
  }

  public String getGoal() {
    return "My goal is: Be a junior software developer." ;
  }

  public String toString() {
    return this.introduce() + "\n" + this.getGoal() + "\n My previous organization is: " + this.previousOrganization + "\n My skipped days: " + skippedDays;
  }
  public Integer skipDays(Integer numberOfDays) {
   return this.skippedDays += numberOfDays;
  }

  public Student(String name, Integer age, String gender, String previousOrganization, Integer skippedDays) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = skippedDays;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public Integer getSkippedDays() {
    return skippedDays;
  }

}
