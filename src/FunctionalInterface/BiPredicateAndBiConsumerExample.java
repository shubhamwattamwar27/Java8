package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateAndBiConsumerExample {

    Predicate<Student> predicateWithGradeLevel = (student -> student.getGradeLevel()>=3);
    Predicate<Student> predicateWithGPA = (student -> student.getGpa()>=3.9);

    BiConsumer<String, List<String>> studentBiConsumer = (name,activities)-> System.out.println(name + " | "+activities);

    BiPredicate<Integer,Double> studentBiPredicate = (gradeLevel,Gpa)-> gradeLevel>=3 && Gpa>=3.9;// (gradeLevel,Gpa)-> { return gradeLevel>=3 && Gpa>=3.9};
    Consumer<Student> studentConsumer = (student -> {
        if(predicateWithGradeLevel.and(predicateWithGPA).test(student))
            studentBiConsumer.accept(student.getName(),student.getActivities());
    });

    Consumer<Student> studentConsumerWithBiPredicate = (student -> {
        if(studentBiPredicate.test(student.getGradeLevel(),student.getGpa()))
            studentBiConsumer.accept(student.getName(),student.getActivities());
    });
    public void printStudents(List<Student> students)
    {
        students.forEach(studentConsumerWithBiPredicate);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new BiPredicateAndBiConsumerExample().printStudents(studentList);
    }
}
