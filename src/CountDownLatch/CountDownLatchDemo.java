package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(4);

        Worker worker1 = new Worker(1000,latch,"worker1");
        Worker worker2 = new Worker(1000,latch,"worker2");
        Worker worker3 = new Worker(1000,latch,"worker3");
        Worker worker4 = new Worker(1000,latch,"worker4");

        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();

        latch.await();

        System.out.println(Thread.currentThread().getName()+" Finished");
    }
}
