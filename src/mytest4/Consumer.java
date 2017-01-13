package mytest4;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;


public class Consumer implements Runnable{
  private static final int DEFAULT_RANGE_FOR_SLEEP = 1000;
  private BlockingQueue<String> blockingQueue;
  
  public Consumer(BlockingQueue<String> blockingQueue) {
    this.blockingQueue = blockingQueue;
  }

  @Override
  public void run() {
    System.out.println("启动消费者线程");
    Random random = new Random();
    boolean flag = true;
    try {
      while (flag) {
        String str = blockingQueue.poll(2, TimeUnit.SECONDS);
        if (str != null) {
          System.out.println("拿到数据：" + str);
          System.out.println("正在消费数据：" + str);
          Thread.sleep(random.nextInt(DEFAULT_RANGE_FOR_SLEEP));
        }else {
          flag = false;
        }
      }
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }finally{
      System.out.println("消费者线程结束");
    }
    
  }
  
  public static void main(String[] args) {
    System.out.println("value1".substring(0,3));
  }
  
}
