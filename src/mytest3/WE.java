package mytest3;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class WE {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executorService = Executors.newScheduledThreadPool(10);
    /*for (int i = 0; i < 10; i++) {
      final int j = i;
      executorService.execute(new Runnable() {
        @Override
        public void run() {
          System.out.println(j + " " + Thread.currentThread().getName());
        }
      });
    }*/
   /* Future future = executorService.submit(new Runnable() {
      @Override
      public void run() {
        System.out.println("WE.main(...).new Runnable() {...}.run()");
      }
    });
    while (future.isDone()) {
      System.out.println(new Date());
    }
    if (future.get() == null) {
      System.out.println("WE.enclosing_method()1");
    }*/
    
    /*Future future = executorService.submit(new Callable<String>() {
      @Override
      public String call() throws Exception {
        System.out.println("WE.main(...).new Callable() {...}.call()");
        Thread.sleep(3000);
        return "我是返回值";
      }
    });
    
    System.out.println(future.get());*/
    /*Set<Callable<String>> set = new HashSet<Callable<String>>();
    set.add(new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "call5";
      }
    });
    
    String str = executorService.invokeAny(set);
    System.out.println(str);*/
    /*Set<Callable<String>> callables = new HashSet<Callable<String>>();
    callables.add(new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "call1";
      }
    });
    callables.add(new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "call2";
      }
    });
    callables.add(new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "call3";
      }
    });
    callables.add(new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "call4";
      }
    });
    callables.add(new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "call5";
      }
    });
    callables.add(new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "call6";
      }
    });
     List<Future<String>> futures = executorService.invokeAll(callables);
     for (Future<String> future : futures) {
       System.out.println(future.get());
    }*/
  }
}
