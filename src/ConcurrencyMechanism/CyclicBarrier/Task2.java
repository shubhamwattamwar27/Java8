package ConcurrencyMechanism.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Task2 implements Runnable
{
    public static int sum = 0;
    public void run()
    {
        // check if newBarrier is broken or not
        System.out.println("Is the barrier broken? - " + CyclicBarrierExample.newBarrier.isBroken());
        sum = 10 + 20;
        try
        {
            CyclicBarrierExample.newBarrier.await(3000, TimeUnit.MILLISECONDS);

            // number of parties waiting at the barrier
            System.out.println("Number of parties waiting at the barrier "+
                    "at this point = " + CyclicBarrierExample.newBarrier.getNumberWaiting());
        }
        catch (InterruptedException | BrokenBarrierException e)
        {
            e.printStackTrace();
        }
        catch (TimeoutException e)
        {
            e.printStackTrace();
        }
    }
}
