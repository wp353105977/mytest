package mytest1;


public interface A {
  void methodA();
  
  static interface B{
    void methodB();
  }
  
  public class AException extends Exception{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public AException(String msg){
      super(msg);
    }
  }
}
