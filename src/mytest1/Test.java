package mytest1;

import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.WeakHashMap;

import mytest.Animal;
import mytest.Dog;


public class Test {
  public static void main(String[] args) {
    Animal dog = new Dog();
    WeakReference<Animal> dogWeak = new WeakReference<Animal>(dog);
    while (dogWeak.get()!=null) {
      System.out.println(System.currentTimeMillis());
    }
    System.out.println("dogweak滞空");
    if (dogWeak == null) {
      System.out.println("Test.main()");
    }
  }
}
