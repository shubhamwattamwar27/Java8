package ConcurrencyMechanism.CompleatableFuture;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CompletableFutureExample {

    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> new Random().nextInt();
        for(int i = 0 ;i< 5; i++){
            CompletableFuture.supplyAsync(() -> supplier.get() + supplier.get())
                    .thenApply(o -> Integer.max(supplier.get(),o))
                    .thenApplyAsync(o -> Integer.min(supplier.get(),o))
                    .thenAccept(integer -> System.out.println(integer));
        }
    }
}
