package homework;

public class Student {
  private String name;
  private Integer age;
  private String gender;
  private String goal;
  private String previousOrganization;
  private Integer skippedDays;

  public void introduce() {
    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
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

  public Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School Of LIfe";
    this.skippedDays = 0;
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
