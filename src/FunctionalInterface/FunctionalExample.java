package FunctionalInterface;

import java.util.Locale;
import java.util.function.Function;

public class FunctionalExample {

    public static Function<String, String> function = s -> s.toUpperCase();

    public static Function<String, String> functionWithDefault = s -> s.toUpperCase().concat(" Default");

    public static String testFunction(String input){
        System.out.println("testFunction");
        return function.apply(input);
    }

    public static String testFunctionWithAndThen(String input){
        System.out.println("testFunctionWithAndThen");
        return function.andThen(functionWithDefault).apply(input);
        //it will follow chaining order
    }

    public static String testFunctionWithCompose(String input){
        System.out.println("testFunctionWithCompose");
        return function.compose(functionWithDefault).apply(input);

        // Compose will 1st execute inner method with param and then apply outer function
        // it will not follow chaining order
    }

    public static void main(String[] args) {
        System.out.println(testFunction("test Function"));
        System.out.println(testFunctionWithAndThen("test Function"));
        System.out.println(testFunctionWithCompose("test Function"));
    }


}
