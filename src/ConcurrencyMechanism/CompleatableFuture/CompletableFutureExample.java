package ConcurrencyMechanism.CompleatableFuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CompletableFutureExample {

    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> new Random().nextInt();
        for(int i = 0 ;i< 5; i++){
            // internally it uses ForkJoinPool
            CompletableFuture.supplyAsync(() -> supplier.get() + supplier.get())
                    .thenApply(o -> Integer.max(supplier.get(),o))
                    .exceptionally(throwable -> 12)
                    .thenApplyAsync(o -> Integer.min(supplier.get(),o))
                    .thenAccept(integer -> System.out.println(integer));
        }


        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService ioExecutorService = Executors.newCachedThreadPool();

        for(int i = 0 ;i< 5; i++){
            // we can specify our thread pool as well -- for async we can execute with diff diff threads
            CompletableFuture.supplyAsync(() -> supplier.get() + supplier.get(),executorService)
                    .thenApply(o -> Integer.max(supplier.get(),o))
                    .thenApplyAsync(o -> Integer.min(supplier.get(),o),ioExecutorService)
                    .thenAcceptAsync(integer -> System.out.println(integer),executorService);
        }


    }
}
