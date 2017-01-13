package com.mycurrent;

import java.util.concurrent.atomic.AtomicInteger;


public class MyAto {
  private final AtomicInteger atomicInteger = new AtomicInteger();
  
  public AtomicInteger getAtomicInteger() {
    return atomicInteger;
  }

  public void add() {
    int a = atomicInteger.getAndIncrement();
    for (int i = 0; i < 5; i++) {
      System.out.print(a);
    }
  }
  
  public void get() {
    for (int i = 0; i < 100; i++) {
      int a = atomicInteger.get();
      for (int j = 0; j < 5; j++) {
        System.out.println(a);
      }
    }
  }
  
  public static void main(String[] args) {
    final MyAto myAto = new MyAto();
    /*new Thread(new Runnable() {
      @Override
      public void run() {
        myAto.add();
      }
    });*/
    
    for (int i = 0; i < 100; i++) {
      new Thread(new Runnable() {
        @Override
        public void run() {
          myAto.add();
        }
      }).start();
    }
    
    try {
      Thread.sleep(5000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(myAto.getAtomicInteger().get());
  }
  
}
