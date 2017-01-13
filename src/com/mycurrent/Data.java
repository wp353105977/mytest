package com.mycurrent;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Data {
  
  private AtomicInteger atomicInteger;
  
  public int getNum() {
    AtomicInteger a = this.atomicInteger;
      for (int i = 0; i < 1000; i++) {
        System.out.println(Thread.currentThread() + "读取:" + a.get());
      }
    return a.get();
  }
  
  public void setNum(int num) {
      try {
        Thread.sleep(20);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
  }
  
  public static void main(String[] args) {
    final Data data = new Data();
    
    for (int i = 0; i < 10; i++) {
      new Thread(new Runnable() {
        
        @Override
        public void run() {
          data.setNum(new Random().nextInt(30));
        }
      }).start();
    }
    
    new Thread(new Runnable() {
      
      @Override
      public void run() {
        data.getNum();
      }
    }).start();
    
  }
  //NO1
  //NO2
  //NO3
}
