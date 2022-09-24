package NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static int getSumWithStream(List<Integer> list)
    {
        return list.stream().reduce(0,Integer::sum); // need to do unboxing from Integer to Int
    }

    public static int getSumWithIntStream()
    {
        return IntStream.rangeClosed(1,6).sum();
    }


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum with getSumWithStream=" + getSumWithStream(list));

        System.out.println("Sum with getSumWithIntStream=" + getSumWithIntStream());
    }
}
