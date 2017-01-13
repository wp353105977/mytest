package mytest4;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Client {
  
  public static void main(String[] args) throws InterruptedException {
    /*final AtomicInteger atomicInteger = new AtomicInteger();
    final BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(5);
    ExecutorService executorService = Executors.newCachedThreadPool();
    for (int i = 0; i < 3; i++) {
      executorService.execute(new Runnable() {
        @Override
        public void run() {
          while (true) {
            try {
              int count = atomicInteger.getAndIncrement();
              System.out.println(Thread.currentThread().getName() + "正在写数据==>" + Thread.currentThread().getName() + ":" + count);
              blockingQueue.put(Thread.currentThread().getName() + "==>" + count);
              Thread.sleep(1000);
            }
            catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      });
    }
    
    for (int i = 0; i < 3; i++) {
      executorService.execute(new Runnable() {
        @Override
        public void run() {
          while (true) {
            try {
              System.out.println(Thread.currentThread().getName() + "正在拿数据....");
              System.out.println(Thread.currentThread().getName() + "拿到的数据为" + blockingQueue.take() );
              Thread.sleep(2000);
            }
            catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      });
    }*/
    ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
    String a =  map.putIfAbsent("a", "aaa");
    String b = map.putIfAbsent("a", "dddd");
    System.out.println(b);
    
    
  }
  
  
  
}
