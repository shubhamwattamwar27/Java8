package FunctionalInterface;

public class FunctionExampleAccessStaticFunction {

    public static String performConcatDefault(String string)
    {
        return FunctionalExample.functionWithDefault.apply(string);
    }

    public static void main(String[] args) {
        System.out.println("Result = "+ performConcatDefault("Hello"));
    }
}
