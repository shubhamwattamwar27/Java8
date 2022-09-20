package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import data.*;

public class ConsumerExample {

    static Consumer<Student> c2 = (s) -> System.out.println(s);
    static Consumer<Student> c3 = (s) -> System.out.print(s.getName());
    static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());
    public static void printStudent() {
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(c2);
    }

    public static void printStudentNameAndActivities() {

        System.out.println("printStudentNameAndActivities");
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(c3.andThen(c4));
    }

    public static void printStudentNameAndActivitiesWithCondition() {

        System.out.println("printStudentNameAndActivitiesWithCondition");
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach((student -> {
            if (student.getGradeLevel()>=3)
                (c3.andThen(c4)).accept(student);
        }));
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("shubham java 8 demo");

        ConsumerExample.printStudent();
        printStudentNameAndActivities();
        printStudentNameAndActivitiesWithCondition();
    }
}
