package homework;

public class Mentor {
  private String name;
  private Integer age;
  private String gender;
  private String level;

  public String introduce() {
    return "Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + ", " + this.level + " mentor.";
  }

  public String getGoal() {
    return "Educate brilliant junior software developers.";
  }

  public String toString() {
    return this.introduce() + "\n" + this.getGoal();
  }

  public Mentor(String name, Integer age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
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
