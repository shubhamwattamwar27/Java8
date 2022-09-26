package ConcurrencyMechanism.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{

    private int delay;
    private CountDownLatch latch;

    public Worker(int delay, CountDownLatch latch,String threadName)
    {
        super(threadName);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(delay);
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + " Finished");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
