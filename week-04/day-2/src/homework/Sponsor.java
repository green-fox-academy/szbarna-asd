package homework;

public class Sponsor {
  private String name;
  private Integer age;
  private String gender;

  public String introduce() {
    return "Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + ".";
  }

  public String getGoal() {
    return "My goal is: Live for the moment!";
  }

  public String toString() {
    return this.introduce() + "\n" + this.getGoal();
  }

  public Sponsor(String name, Integer age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
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
}
