package homework;

public class Mentor {
  private String name;
  private Integer age;
  private String gender;
  private String level;

  public void introduce() {
    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + ", " + this.level + " mentor.");
  }

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public Mentor(String name, Integer age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public Mentor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.level = "intermediate";
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

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }
}
