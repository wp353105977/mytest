package mytest3;


public class Client {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner.name();
  }
}
