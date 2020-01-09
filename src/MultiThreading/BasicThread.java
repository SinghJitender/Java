package MultiThreading;

import java.util.stream.IntStream;

public class BasicThread {

  public static void main(String[] args) throws Exception {

    Runnable r1 = () -> {
      IntStream.range(0,10).forEach( i -> System.out.println("Thread 1 :"+i));
    };
    Runnable r2 = () -> {
      IntStream.range(0,10).forEach( i -> System.out.println("Thread 2 :"+i));
    };

    //IntStream.range(0,10).forEach( i -> System.out.println("Thread Main :"+i));
    Thread thread = new Thread(r1);
    thread.start();
    synchronized (thread){
      Thread thread2 = new Thread(r2);
      thread2.start();
    }

  }

}
