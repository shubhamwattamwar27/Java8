package Stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;


public class StreamFilterExample {

    public static List<Student> getFemaleStudent(){
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .filter(student -> student.getGender().equals("female"))
                //filter all female students
                .collect(Collectors.toList());
    }

    public static List<Student> getFemaleStudentWithGpa(){
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .filter(student -> student.getGender().equals("female"))
                //filter all female students
                .filter(student -> student.getGpa()>3.5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("getFemaleStudent");
        getFemaleStudent().forEach(System.out::println);

        System.out.println("getFemaleStudentWithGpa");
        getFemaleStudentWithGpa().forEach(System.out::println);

    }
}
