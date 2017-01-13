package com.mycurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.locks.ReentrantLock;



public class Test {
  public static void main(String[] args) throws InterruptedException {
    /*List<String> list = new ArrayList<String>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");*/
    //ReentrantLock
    /*int index = 0;
    for (String string : list) {
      list.remove(index);
      index++;
    }*/
    /*for (int i = 0; i < list.size(); i++) {
      String string = list.get(i);
      list.remove(string);
    }*/
    /*Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      String str = it.next();
      if (str.equals("2")) {
        list.remove(str);
      }
    }
    
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }*/
    //Iterator<String> it = list.iterator();
    //list.remove(0);
    /*while (it.hasNext()) {
      System.out.println(it.next());
    }*/
   /* Thread.currentThread().interrupt();
    System.out.println(Thread.currentThread().isInterrupted());
    try {
      Thread.sleep(5000);
    }
    catch (InterruptedException e) {
      System.out.println("中断了。。。");
      System.out.println(Thread.currentThread().isInterrupted());
      e.printStackTrace();
    }*/
    /*int i = 0;
    while (!Thread.currentThread().isInterrupted()) {
      try {
          Thread.sleep(100);
          i++;
          if (i == 5) {
            break;
          }
      } catch (InterruptedException e) {
          Thread.currentThread().interrupt();//重新设置中断标示
      }
  }
    System.out.println("......");*/
    
    
    /*Thread thread = new Thread(new Runnable() {
      
      @Override
      public void run() {
        while (true) {
          System.out.println("is runing...");
          long time = System.currentTimeMillis();
          while (System.currentTimeMillis() - time < 1000) {
            
          }
        }
      }
    });
    thread.start();
    thread.interrupt();*/
    Thread t1 = new Thread(new ThreadTesterA());
    Thread t2 = new Thread(new ThreadTesterB());
    t1.start();
   // t1.join(); // wait t1 to be finished
    t2.start();
    t2.join(); // in this program, this may be removed
    ReentrantLock lock = new ReentrantLock();
    lock.lock();
    lock.unlock();
  }
}



class ThreadTesterA implements Runnable {

  private int counter;

  @Override
  public void run() {
    while (counter <= 10) {
      System.out.print("Counter = " + counter + " ");
      counter++;
    }
    System.out.println();
  }
}

class ThreadTesterB implements Runnable {

  private int i;

  @Override
  public void run() {
    while (i <= 10) {
      System.out.print("i = " + i + " ");
      i++;
    }
    System.out.println();
  }
}
