package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> checkEven = (i) -> {return (i%2)==0;};

    static Predicate<Integer> checkEven1 = (i) -> i%2==0 ; //if it contains only 1 statement then we can write it directly

    static Predicate<Integer> checkDivisibleBy5 = (i) -> (i%5)==0;

    static void predicateAnd()
    {
        System.out.println("Predicate And :" + checkEven1.and(checkDivisibleBy5).test(10));
        System.out.println("Predicate And2 :" + checkEven1.and(checkDivisibleBy5).test(8));
    }

    static void predicateOr()
    {
        System.out.println("Predicate Or :" + checkEven1.or(checkDivisibleBy5).test(10));
        System.out.println("Predicate Or2 :" + checkEven1.or(checkDivisibleBy5).test(8));
    }

    static void predicateNegate() {
        System.out.println("Predicate negate :" + checkDivisibleBy5.negate().test(10));
        System.out.println("Predicate negate1 :" + checkDivisibleBy5.negate().test(11));
    }

    public static void main(String[] args) {

        System.out.println("Check Even :"+checkEven.test(5));

        System.out.println("Check Even1 :"+checkEven1.test(5));

        System.out.println("Check Event and Divisible By 5:"+checkEven1.and(checkDivisibleBy5).test(10));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
