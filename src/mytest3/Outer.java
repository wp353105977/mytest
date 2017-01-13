package mytest3;


public class Outer {
  static {
    System.out.println("Outer.enclosing_method()");
  }
  
  public static class Inner{
    static{
      System.out.println("Outer.Inner.enclosing_method()");
    }
    
    public static void name(){
      System.out.println("Outer.Inner.name()");
    }
  }
}
