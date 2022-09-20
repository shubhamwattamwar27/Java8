package lambadas;

import java.util.Comparator;

public class ComparatorLambdaEx {

    public static void main(String[] args) {
        /**
         * prior to java 8
         */
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result with Legacy approach for Comparator=" + integerComparator.compare(3,4));

        /**
         * with Lambda
         */
        Comparator<Integer> integerComparatorWithLambda = (Integer i1,Integer i2) -> i1.compareTo(i2);

        System.out.println("Result with lambda approach for Comparator=" + integerComparatorWithLambda.compare(3,4));

        Comparator<Integer> integerComparatorWithLambda1 = (i1,i2) -> i1.compareTo(i2);

        System.out.println("Result with lambda approach for Comparator1=" + integerComparatorWithLambda1.compare(3,4));
    }
}
