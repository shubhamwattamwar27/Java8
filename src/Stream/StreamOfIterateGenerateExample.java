package Stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {

    public static void main(String[] args) {
        Stream<String> integerStream =  Stream.of("Shubham","Ayush","kekan","ram");
        System.out.println("Stream of");
        integerStream.forEach(System.out::println);

        System.out.println("Stream iterate");
        Stream.iterate(1,i -> i*2 )
                .limit(11).forEach(System.out::println);

        System.out.println("Stream Generate");
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(10)
                        .forEach(System.out::println);

    }
}
