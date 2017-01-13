package mytest2;


public class MyListener implements Listener{

  @Override
  public void onEventStart(Event event) {
    String name = "";
    if (event instanceof Namable) {
      name = ((Namable) event).getName();
    }
    System.out.println(name + "开始了");
  }
  
}
