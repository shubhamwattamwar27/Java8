package ConcurrencyMechanism.BlockingQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {

    public static void main(String[] args)
    {

        priorityBlockingQueueWithDefaultConstructor();
        priorityBlockingQueueWithCollectionConstructor();
        priorityBlockingQueueWithInitialCapacity();
    }

    private static void priorityBlockingQueueWithInitialCapacity() {
        // define capacity of PriorityBlockingQueue
        int capacity = 15;

        // create object of PriorityBlockingQueue
        PriorityBlockingQueue<Integer> priorityBlockingQueue
                = new PriorityBlockingQueue<Integer>(
                capacity, Comparator.reverseOrder());

        // add  numbers
        priorityBlockingQueue.add(1);
        priorityBlockingQueue.add(2);
        priorityBlockingQueue.add(3);

        // print queue
        System.out.println("PriorityBlockingQueue:" + priorityBlockingQueue);
    }

    private static void priorityBlockingQueueWithDefaultConstructor() {
        // create object of PriorityBlockingQueue
        // using PriorityBlockingQueue() constructor
        PriorityBlockingQueue<Integer> priorityBlockingQueue
                = new PriorityBlockingQueue<>();

        // add  numbers
        priorityBlockingQueue.add(1);
        priorityBlockingQueue.add(2);
        priorityBlockingQueue.add(3);
        priorityBlockingQueue.add(4);
        priorityBlockingQueue.add(5);

        // print queue
        System.out.println("PriorityBlockingQueue:" + priorityBlockingQueue);
    }

    private static void priorityBlockingQueueWithCollectionConstructor() {

        // Creating a Collection
        List<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        // create object of PriorityBlockingQueue
        // using PriorityBlockingQueue(Collection c)
        // constructor
        PriorityBlockingQueue<Integer> integerPriorityBlockingQueue
                = new PriorityBlockingQueue<Integer>(v);

        // print queue
        System.out.println("PriorityBlockingQueue:" + integerPriorityBlockingQueue);

        // get head of PriorityBlockingQueue
        int head = integerPriorityBlockingQueue.peek();

        // print head of PriorityBlockingQueue
        System.out.println("Head of integerPriorityBlockingQueue: " + head);
    }

}
