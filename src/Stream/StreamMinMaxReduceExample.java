package Stream;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamMinMaxReduceExample {

    public static int findMaxFromData(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNoOfNotebooks)
                //.reduce(0,(integer, integer2) -> integer>integer2 ?integer:integer2);
                //.reduce(0,(integer, integer2) -> Integer.max(integer,integer2));
                .reduce(0,Integer::max);
    }

    public static Optional<Integer> findMaxFromDataWithOptional(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNoOfNotebooks)
                .reduce(Integer::max);
    }

    public static int findMinFromData(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNoOfNotebooks)
                //.reduce(0,(integer, integer2) -> integer>integer2 ?integer:integer2);
                //.reduce(0,(integer, integer2) -> Integer.max(integer,integer2));
                .reduce(Integer.MIN_VALUE,Integer::min);
    }

    public static Optional<Integer> findMinFromDataWithOptional(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNoOfNotebooks)
                .reduce(Integer::min);
    }

    public static void main(String[] args) {

        System.out.println("findMaxFromData="+findMaxFromData());
        Optional<Integer> optionalMaxIntegerValue = findMaxFromDataWithOptional();
        System.out.println("optionalMaxIntegerValue="+optionalMaxIntegerValue);
        if(optionalMaxIntegerValue.isPresent())
            System.out.println("findMaxFromDataWithOptional ="+ optionalMaxIntegerValue.get());
        else
            System.out.println("Input is null");

        System.out.println("findMinFromData="+findMinFromData());
        Optional<Integer> optionalMinIntegerValue = findMinFromDataWithOptional();
        System.out.println("findMinFromDataWithOptional="+optionalMinIntegerValue);
        if(optionalMinIntegerValue.isPresent())
            System.out.println("findMinFromDataWithOptional ="+ optionalMinIntegerValue.get());
        else
            System.out.println("Input is null");

    }
}
