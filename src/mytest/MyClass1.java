package mytest;

import java.io.UnsupportedEncodingException;
import java.util.UUID;


public class MyClass1 {
  public static void main(String[] args) throws UnsupportedEncodingException {
    String string = "呵呵";
    System.out.println(new String(string.getBytes("UTF-8"), "iso-8859-1"));
  }
}
