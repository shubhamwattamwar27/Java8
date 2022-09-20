package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction =
            ((students, studentPredicate) -> {
               Map<String,Double> map = new HashMap<>();

               students.forEach((student)->{
                   if(studentPredicate.test(student))
                       map.put(student.getName(),student.getGpa());
               });
               return map;
            });

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Result =" + biFunction.apply(studentList,PredicateStudentExample.predicateWithGPA));
    }
}
