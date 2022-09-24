package NumericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,50);

        IntStream intStreamWithRangeClosed = IntStream.rangeClosed(1,50);

        System.out.println("intStream Range = "+intStream.count());

        System.out.println("intStreamWithRangeClosed Range closed = "+intStreamWithRangeClosed.count());

        LongStream longStream = LongStream.range(1,50);
        LongStream longStreamWithRangeClosed = LongStream.rangeClosed(1,50);
        System.out.println("longStream Range = "+longStream.count());

        System.out.println("longStreamWithRangeClosed Range closed = "+longStreamWithRangeClosed.count());

        System.out.println("double stream ="+IntStream.range(1,50).asDoubleStream().count());

        System.out.println("intStream Range with sum= "+IntStream.range(1,50).sum());

        System.out.println("intStream Range with max= "+IntStream.range(1,50).max().getAsInt());

        System.out.println("intStream Range with min= "+IntStream.range(1,50).min().getAsInt());

        System.out.println("intStream Range with max= "+LongStream.range(1,50).average().getAsDouble());

    }


}
