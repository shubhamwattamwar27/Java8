package FunctionalInterface;

import java.util.function.UnaryOperator;

// if you Function<> has same type of input and output param
public class UnaryOperatorExample {

    public static UnaryOperator<String> stringUnaryOperator = s -> s.concat(" Default");

    public static void main(String[] args) {
        System.out.println("Result =" + stringUnaryOperator.apply("Hello"));
    }
}
