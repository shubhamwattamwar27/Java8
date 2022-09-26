package ConcurrencyMechanism.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;

class Task1 implements Runnable
{
    public static int product = 0;
    public void run()
    {
        product = 2 * 3;
        try
        {
            CyclicBarrierExample.newBarrier.await();
        }
        catch (InterruptedException | BrokenBarrierException e)
        {
            e.printStackTrace();
        }
    }
}