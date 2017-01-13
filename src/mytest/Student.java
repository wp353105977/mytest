package mytest;

public class Student {
  
  private String name;
  
  private int age;
  
  public Student(){
  }
  
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }

  /*@Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    
    if (this == obj) {
      return true;
    }
    
    if (obj instanceof Student) {
      Student s = (Student) obj;
      if (this.name.equals(s.name) && this.age == s.age) {
        return true;
      }
    }
    return false;
  }*/

  @Override
  public int hashCode() {
    return age;
  }
  
}
