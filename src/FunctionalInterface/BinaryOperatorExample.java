package FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

//if input and out type is same then instead of using Function<> you can use Unary<> or Binary<> operator
// if you BiFunction<> has same type of input and output param
public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (integer, integer2) -> integer*integer2;

        System.out.println("Result of Binary Operator =" + binaryOperator.apply(4,5));

        Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
        BinaryOperator<Integer> binaryOperatorWithMaxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of Binary Operator maxBy=" + binaryOperatorWithMaxBy.apply(4,5));

        BinaryOperator<Integer> binaryOperatorWithMinBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of Binary Operator maxBy=" + binaryOperatorWithMinBy.apply(4,5));

    }
}
