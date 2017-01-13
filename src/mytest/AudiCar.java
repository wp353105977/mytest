package mytest;

public class AudiCar implements Car {
  
  private String name;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public void brand() {
    System.out.println("奥迪");
  }
  
}
