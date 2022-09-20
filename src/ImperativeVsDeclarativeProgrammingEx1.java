import java.util.stream.IntStream;

public class ImperativeVsDeclarativeProgrammingEx1 {

    public static void main(String[] args) {
       /*
            Imperative style of programming
       */

        int sum = 0;
        for(int i = 0;i<=100;i++)
            sum += i;
        System.out.println("Sum with Imperative approach="+sum);
        /*
            Declarative style of programming
       */

        int sum1 = IntStream.rangeClosed(0,100).sum();
        System.out.println("Sum with Declarative approach="+sum1);

        int sum2 = IntStream.rangeClosed(0,100).parallel().sum(); // for multi-Threaded env
        System.out.println("Sum with Declarative approach for multi-Threading="+sum2);
    }
}
