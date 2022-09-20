package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    public static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {

        Map<String,Double> studentMap = new HashMap<>();
        students.forEach(student -> {
            studentMap.put(student.getName(),student.getGpa());
        });
        return studentMap;
    });

    public static Function<List<Student>, Map<String,Double>> studentFunctionWithFilter = (students -> {

        Map<String,Double> studentMap = new HashMap<>();
        students.forEach(student -> {
            if(PredicateStudentExample.predicateWithGPA.test(student))
                studentMap.put(student.getName(),student.getGpa());
        });
        return studentMap;
    });

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Result =" + studentFunction.apply(studentList));
        System.out.println("Result =" + studentFunctionWithFilter.apply(studentList));
    }
}
