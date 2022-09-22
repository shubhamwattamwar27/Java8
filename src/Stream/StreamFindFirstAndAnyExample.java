package Stream;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindFirstAndAnyExample {

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.6)
                .findFirst();
    }

    public static  Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.6)
                .findAny();
    }

    public static void main(String[] args) {

        Optional<Student> optionalStudentFindAny = findAnyStudent();

        if(optionalStudentFindAny.isPresent())
            System.out.println("Result of findAnyStudent =" + optionalStudentFindAny.get());
        else
            System.out.println("Student Not Found !");

        Optional<Student> optionalStudentFindFirst = findFirstStudent();

        if(optionalStudentFindFirst.isPresent())
            System.out.println("Result of findFirstStudent =" + optionalStudentFindFirst.get());
        else
            System.out.println("Student Not Found !");
    }
}
