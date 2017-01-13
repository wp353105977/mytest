package mytest;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class Dog implements Animal{
  
  public static void output(int[] array) {

    if (array!=null) {

    for (int i = 0; i < array.length; i++) {

    System.out.print(array[i]+" ");

    }

    }

    System.out.println();

    }

  @Override
  public void call() {
    System.out.println("Dog.call()");
  }
  
  public static void main(String[] args) {
   // Collections
   // Arrays
    //int[] array = new int[5];
   /// output(array);
    //Arrays.fill(array, 5);
   // output(array);
    //Arrays.fill(array,1, 3, 5);
    //output(array);
   /// int[] array1 = {7,8,3,2,12,6,3,5,4};

  //对数组的第2个到第6个进行排序进行排序
  /*Arrays.sort(array1);
  System.out.println("对数组的第2个到第6个元素进行排序进行排序：Arrays.sort(array,2,7)：");
  output(array1);
  System.out.println(Arrays.binarySearch(array1, 3));*/
    /*Car car = new BenzCar();
    
    List<Car> list = Arrays.asList(car);
    list.get(0).brand();
    list.remove(0);*/
    //ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>();
    
    System.out.println("sdasd\nssds");
    System.out.println(new StringBuilder().append("dsad\ndsad").toString());
  }
  
}
