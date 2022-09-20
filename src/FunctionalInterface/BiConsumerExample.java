package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void printNameANdActivities()
    {
            BiConsumer<String, List<String>> biConsumer = (name,activities) ->{
                System.out.println(name + " | "+activities);
            };

            List<Student> studentList = StudentDataBase.getAllStudents();

            studentList.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));
    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a,b) ->{
            System.out.println("Value of A :" + a +" , B :"+b);
        };
        biConsumer.accept("Java7","Java8");

        BiConsumer<Integer,Integer> multiply = (a,b)->{
            System.out.println("Multiplication is ="+(a*b));
        };

        BiConsumer<Integer,Integer> division = (a,b)->{
            System.out.println("division is ="+(a/b));
        };

        multiply.andThen(division).accept(10,2);

        printNameANdActivities();
    }
}
