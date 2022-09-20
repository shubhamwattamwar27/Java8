package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> predicateWithGradeLevel = (student -> student.getGradeLevel()>=3);
    Predicate<Student> predicateWithGPA = (student -> student.getGpa()>=3.9);

    BiConsumer<String, List<String>> studentBiConsumer = (name,activities)-> System.out.println(name + " | "+activities);

    Consumer<Student> studentConsumer = (student -> {
        if(predicateWithGradeLevel.and(predicateWithGPA).test(student))
            studentBiConsumer.accept(student.getName(),student.getActivities());
    });

    public void printStudents(List<Student> students)
    {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printStudents(studentList);
    }
}
