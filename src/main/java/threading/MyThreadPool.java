package threading;

import java.util.concurrent.*;

public class MyThreadPool {
    public static void main(String[] args) {

        ExecutorService fixedPool = Executors.newFixedThreadPool(3);
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        ScheduledExecutorService singleExecutorSch = Executors.newSingleThreadScheduledExecutor();

        singleExecutorSch.scheduleAtFixedRate(new MyRunnable(),6, 5,TimeUnit.SECONDS);
        singleExecutorSch.submit(new MyRunnable());

    }

 static  class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for(int i=0;i<5;i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
