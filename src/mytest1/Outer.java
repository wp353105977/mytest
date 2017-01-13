package mytest1;


public class Outer {
  private int x;

  public Outer(int x) {
    this.x = x;
  }
  
  public void setX(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }
  
  public void add() {
    this.x++;
  }
  
  public class Inner{
    private String str="garbage";
    private int x = 99;

    public String getStr() {
      return str;
    }
    
    public void setStr(String str) {
      this.str = str;
    }
    
    public void test() {
      System.out.println("外部x= " + Outer.this.x);
      System.out.println("内部y="  + this.str);
      System.out.println("内部x=" + x);
    }
    
    public void test1() {
      add();
    }
    
    
  }
  
  public static void main(String[] args) {
    Outer outer = new Outer(10);
    Outer.Inner inner = outer.new Inner();
    inner.test();
    inner.test1();
    inner.test();
  }
  
}
