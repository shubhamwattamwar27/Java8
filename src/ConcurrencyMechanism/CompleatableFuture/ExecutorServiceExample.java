package ConcurrencyMechanism.CompleatableFuture;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(15);

        //submit the task and accept the placeholder object for return value
        Future<Integer> future = executorService.submit(new Task());

        try{
            //blocking operation
            Integer res = future.get();
            System.out.println("Res = "+res);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
