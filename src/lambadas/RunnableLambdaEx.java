package lambadas;

public class RunnableLambdaEx {

    public static void main(String[] args) {

        /*
         * prior to java 8
         * */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        /*
        With Lambda
        */

        Runnable runnableWithLambda = () -> {
            System.out.println("Inside Runnable 2 with java 8");
        };
        new Thread(runnableWithLambda).start();

        Runnable runnableWithLambda1 = () -> System.out.println("Inside Runnable 3 with java 8");
            // if we have only 1 statement then {curly braces } are not needed
        new Thread(runnableWithLambda1).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 3.1 with legacy approach");
            }
        }).start();
        new Thread(() -> System.out.println("Inside Runnable 4 with java 8")).start();
    }
}
