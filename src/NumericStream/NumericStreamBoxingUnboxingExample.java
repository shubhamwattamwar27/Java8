package NumericStream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    public static int unbox(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue) //converted to IntStream from Integer list
                .sum();
    }

    public static List<Integer> boxing(){
        return IntStream.range(1,50)
                .boxed() //converted from IntStream to Stream<Integer>
                .collect(Collectors.toList());
    }

    public static List<Integer> mapToObject(){
        return IntStream.range(1,10)
                .mapToObj((i)->{
                 return new Integer(i);
                }) //converted from IntStream to Stream<Integer>
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        System.out.println("Boxing = " + boxing());

        System.out.println("Unboxing = " + unbox(Arrays.asList(1,2,3,4,5)));

        System.out.println("mapToObject= "+mapToObject());
    }

    public int returnInt()
    {
        try{
        return 1;
       // System.out.println("retutnInt");
        }
        catch(Exception e)
        {
        }
        finally {
            System.out.println();
    }
        return 1;
    }


}
