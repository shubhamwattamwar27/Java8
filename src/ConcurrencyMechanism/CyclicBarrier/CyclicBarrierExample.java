package ConcurrencyMechanism.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierExample implements Runnable {
    public static CyclicBarrier newBarrier = new CyclicBarrier(4);

    public static void main(String[] args)
    {
        int a = 10;
        Integer abc = new Integer(10);
        System.out.println((a==abc) + "  == "+ (a+abc));
        // parent thread
        CyclicBarrierExample test = new CyclicBarrierExample();

        Thread t1 = new Thread(test);
        t1.start();
    }
    public void run()
    {
        System.out.println("Number of parties required to trip the barrier = "+
                newBarrier.getParties());
        System.out.println("Sum of product and sum = " + (Task1.product +
                Task2.sum + Task3.substraction));

        // objects on which the child thread has to run
        Task1 comp1 = new Task1();
        Task2 comp2 = new Task2();
        Task3 comp3 = new Task3();

        // creation of child thread
        Thread t1 = new Thread(comp1);
        Thread t2 = new Thread(comp2);
        Thread t3 = new Thread(comp3);

        // moving child thread to runnable state
        t1.start();
        t2.start();
        t3.start();

        try
        {
            System.out.println("No. of parties= " + newBarrier.getParties());
            System.out.println("No. of waiting threads= " + newBarrier.getNumberWaiting());
            System.out.println( " isBroken= "+newBarrier.isBroken());
            CyclicBarrierExample.newBarrier.await();
        }
        catch (InterruptedException | BrokenBarrierException e)
        {
            e.printStackTrace();
        }

        // barrier breaks as the number of thread waiting for the barrier
        // at this point = 3
        System.out.println("Sum of product and sum = " + (Task1.product +
                Task2.sum + Task3.substraction));

        // Resetting the newBarrier
        newBarrier.reset();
        System.out.println("Barrier reset successful");
    }
}

