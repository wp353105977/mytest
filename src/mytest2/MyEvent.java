package mytest2;


public class MyEvent implements Event, Namable{
  
  private static final String EVENTNAME = MyEvent.class.getName();
  private String name;
  
  @Override
  public void start() {
    System.out.println("MyEvent.start()");
  }

  @Override
  public String getName() {
    String name = this.name;
    if (name == null || name == "") {
      name = EVENTNAME;
    }
    return name;
  }
  
}
