package lambadas;

import java.util.function.Consumer;

public class LocalVariablesForLambdas {

    static int value = 4;

    public static void main(String[] args) {

        //local variable values can not be changed inside the lambdas,
        // you have dcliare as a class variable as a static or final

        // you can not use same name of local variable and the variable name which is using
        //in lambda
        Consumer<Integer> consumer = (i) -> {
          value += i;
            System.out.println("value = "+ value);
        };

        consumer.accept(3);
    }

}
