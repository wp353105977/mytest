package mytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class WhiteHandler implements InvocationHandler{
  private Object object;
  
  public WhiteHandler(Object object) {
    this.object = object;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("前置");
    method.invoke(object, args);
    System.out.println("后置");
    return null;
  }
  
}
