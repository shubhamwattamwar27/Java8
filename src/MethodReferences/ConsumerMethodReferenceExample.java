package MethodReferences;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<String> consumer = s -> System.out.println(s);

    static Consumer<Student> studentConsumer = s -> System.out.println(s);

    static Consumer<String> consumerMethodReference = System.out::println;

    //ClassName::MethodName
    static Consumer<Student> activitiesMethodReference = Student::printActivities;

    public static void main(String[] args) {
        consumer.accept("Java");
        consumerMethodReference.accept("Java Method Reference");
        StudentDataBase.getAllStudents().forEach(studentConsumer);
        System.out.println("activitiesMethodReference");
        StudentDataBase.getAllStudents().forEach(activitiesMethodReference);
    }
}
