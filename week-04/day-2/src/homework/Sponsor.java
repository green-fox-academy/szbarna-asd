package homework;

public class Sponsor {
  private String name;
  private Integer age;
  private String gender;
  private String company;
  private Integer hiredStudents;

  public void introduce() {
    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public Integer hire() {
    return ++this.hiredStudents;
  }
  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public Sponsor(String name, Integer age, String gender, String company, Integer hiredStudents) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = hiredStudents;
  }

  public Sponsor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.company = "Google";
    this.hiredStudents = 0;
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

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Integer getHiredStudents() {
    return hiredStudents;
  }

  public void setHiredStudents(Integer hiredStudents) {
    this.hiredStudents = hiredStudents;
  }
}
