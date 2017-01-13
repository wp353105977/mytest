package mytest4;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class Producer implements Runnable{
  
  
  
  private static final int  DEFAULT_RANGE_FOR_SLEEP = 1000;
  private volatile boolean      isRunning               = true;
  private static AtomicInteger atomicInteger = new AtomicInteger();
  private BlockingQueue<String> blockingQueue;
  
  public Producer(BlockingQueue<String> blockingQueue) {
    this.blockingQueue = blockingQueue;
  }

  @Override
  public void run() {
    boolean flag = true;
    Random r = new Random();
    System.out.println("启动生产线程");
    try {
      while (flag) {
        System.out.println("正在生产数据");
        Thread.sleep(r.nextInt(DEFAULT_RANGE_FOR_SLEEP));
        String str = "data" + atomicInteger.getAndIncrement();
        System.out.println("将数据：" + str + "放入队列...");
        if (!blockingQueue.offer(str, 2, TimeUnit.SECONDS)) {
            System.out.println("放入数据失败：" + str);
        } 
      }
    }
    catch (Exception e) {
    }
    
    
  }
  
  public void stop() {
    this.isRunning = false;
}
  
  
}
