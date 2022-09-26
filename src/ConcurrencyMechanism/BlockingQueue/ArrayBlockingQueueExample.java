package ConcurrencyMechanism.BlockingQueue;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample {

    public static void main(String[] args)
            throws InterruptedException
    {

        // define capacity of ArrayBlockingQueue
        int capacity = 5;

        // create object of ArrayBlockingQueue
        BlockingQueue<String> queue
                = new ArrayBlockingQueue<>(capacity);

        // Add elements to ArrayBlockingQueue using put
        // method
        queue.put("test1");
        queue.put("test2");
        queue.put("test3");
        queue.put("test4");
        queue.put("test5");

        // print Queue
        System.out.println("queue contains " + queue);

        // remove some elements
        queue.remove();
        queue.remove();

        // Add elements to ArrayBlockingQueue
        // using put method
        queue.put("test6");
        queue.put("test7");

        System.out.println("queue contains " + queue);

        // Call iterator() method and Create an iterator
        Iterator iteratorValues = queue.iterator();

        // Print elements of iterator
        System.out.println("\nThe iterator values:");
        while (iteratorValues.hasNext()) {
            System.out.println(iteratorValues.next());
        }
    }
}

