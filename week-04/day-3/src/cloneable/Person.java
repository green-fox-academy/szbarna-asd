package cloneable;

  public class Person {
    protected String name;
    protected Integer age;
    protected String gender;
    protected String myGoalIs = "My goal is: ";

    public String introduce() {
      return "Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender;
    }

    public String getGoal() {
      return myGoalIs + "Live for the moment!";
    }

    public Person(String name, Integer age, String gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
    }

    public Person() {
      this.name = "Jane Doe";
      this.age = 30;
      this.gender = "female";
    }

    public Person clone() {
      return this;
    }
  }
