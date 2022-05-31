package threading;

import java.util.concurrent.*;

public class ThreadingBasics {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(Thread.currentThread().getName());
//        Thread t1 = new Thread(new MyRunnable());
//        t1.start();
//        Future<Integer> ex = Executors.newFixedThreadPool(1).submit(new MyCallable());
//        System.out.println(ex.get());
//        Executor e = new SingleExecutor();
//        e.execute(new MyRunnable());
        Executor et = new ThreadPerTask();
        et.execute(new MyRunnable());
        et.execute(new MyRunnable());
    }
}

 class MyRunnable implements Runnable{
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

 class MyCallable implements Callable{
    @Override
    public Object call() throws Exception {
        int res=0;
        System.out.println(Thread.currentThread().getName());
        for(int i=5;i>0;i--){
            System.out.println(i);
            res+=i;
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        return res;
    }
}

 class SingleExecutor implements Executor{
    @Override
    public void execute(Runnable command) {
        command.run();
    }
}

 class ThreadPerTask implements Executor{
    @Override
    public void execute(Runnable command) {
        Thread th = new Thread(command);
        th.start();
    }
}