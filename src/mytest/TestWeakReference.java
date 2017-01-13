package mytest;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;


public class TestWeakReference {

  
  public static void main(String[] args) {
    
    Dog dog = new Dog();
    WeakReference<Dog> weakCar = new WeakReference<Dog>(dog);
    
    int i=0;
    
    while(true){
      if(weakCar.get()!=null){
        i++;
        System.out.println("Object is alive for "+i+" loops - "+weakCar);
      }else{
        System.out.println("Object has been collected.");
        break;
      }
    }
  }

}