package ConcurrencyMechanism.BlockingQueue;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueWithInitialCapacity {

    public static void main(String[] args)
    {
        // define capacity of LinkedBlockingQueue
        int capacity = 15;

        // create object of LinkedBlockingQueue
        // using LinkedBlockingQueue(int initialCapacity)
        // constructor
        LinkedBlockingQueue<Integer> lbqWithCapacity
                = new LinkedBlockingQueue<Integer>(capacity);

        // add  numbers
        lbqWithCapacity.add(1);
        lbqWithCapacity.add(2);
        lbqWithCapacity.add(3);

        // print queue
        System.out.println("LinkedBlockingQueue:" + lbqWithCapacity);

        //remove all
        lbqWithCapacity.clear();

        // add  numbers
        lbqWithCapacity.add(4);
        lbqWithCapacity.add(5);
        lbqWithCapacity.add(6);

        System.out.println("LinkedBlockingQueue After remove and add:" + lbqWithCapacity);

        // create Iterator of linkedQueue using iterator() method
        Iterator<Integer> listOfNames = lbqWithCapacity.iterator();

        // print result
        System.out.println("list of numbers:");
        while (listOfNames.hasNext())
            System.out.println(listOfNames.next());
    }
}
