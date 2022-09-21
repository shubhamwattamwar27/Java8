package MethodReferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> function = (name) -> name.toUpperCase() ;

    static Function<String,String> methodReferenceExample = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println("Function example = " + function.apply("Test with noramal"));

        System.out.println("Function with Method Reference example = "+ methodReferenceExample.apply("Test Method Reference"));
    }
}
