package Stream;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> list){
        return list.stream()
                //1st param is initial value and 2nd if BinaryOperator or BiFunction
                /* resultOfLastComputation = a and nextValue = b
                * 1st itr a = 1 , b = 2 result = 2
                * 2nd irt a = 2 , b = 3 result = 6
                * 3rd itr a = 6 , b = 4 result = 24
                * and go on.....
                * */
                .reduce(1,
                        (resultOfLastComputation, nextValue) ->resultOfLastComputation*nextValue );
    }

    public static Optional<Integer> performMultiplicationWithoutInitialValue(List<Integer> list){

        Optional<Integer> optionalInteger = list.stream().reduce((a,b) ->a*b);
        return optionalInteger;
    }

    public static Optional<Student> getStudentWithHighestGpa(){


        Optional<Student> optionalStudent =
                StudentDataBase.getAllStudents().stream().reduce((a, b) -> (a.getGpa()> b.getGpa()) ? a : b);

        /*StudentDataBase.getAllStudents().stream().
                reduce((a, b) ->{
                    if(a.getGpa()>b.getGpa())
                        return a;
                    else
                        return b;
                });*/
        return optionalStudent;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);

        System.out.println("performMultiplication= "+ performMultiplication(list));

        System.out.println("performMultiplicationWithoutInitialValue= "+ performMultiplicationWithoutInitialValue(list));

        System.out.println("performMultiplicationWithoutInitialValue= "+ performMultiplicationWithoutInitialValue(list).isPresent());

        if(performMultiplicationWithoutInitialValue(list).isPresent())
            System.out.println("performMultiplicationWithoutInitialValue= "+ performMultiplicationWithoutInitialValue(list).get());

        List<Integer> List1 = new ArrayList<>();

        System.out.println("performMultiplicationWithoutInitialValue= "+ performMultiplicationWithoutInitialValue(List1).isPresent());

        Optional<Student> student = getStudentWithHighestGpa();
        if(student.isPresent())
            System.out.println("getStudentWithHighestGpa = " + student.get());
    }


}
