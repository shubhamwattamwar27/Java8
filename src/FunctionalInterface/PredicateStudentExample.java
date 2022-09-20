package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> predicateWithGradeLevel = (student) -> student.getGradeLevel()>=3;
    static Predicate<Student> predicateWithGPA = (student) -> student.getGpa()>=3.9;

    public static void filterStudentByGradeLevel(){
        System.out.println("filterStudentByGradeLevel");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(predicateWithGradeLevel.test(student))
                System.out.println(student);
        }));
    }

    public static void filterStudentByGPA(){
        System.out.println("filterStudentByGPA");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(predicateWithGPA.test(student))
                System.out.println(student);
        }));
    }

    public static void filterStudentByGradeLevelAndGPA(){
        System.out.println("filterStudentByGradeLevelAndGPA");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(predicateWithGradeLevel.and(predicateWithGPA).test(student))
                System.out.println(student);
        }));
    }

    public static void filterStudentByGradeLevelOrGPA(){
        System.out.println("filterStudentByGradeLevelOrGPA");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(predicateWithGradeLevel.or(predicateWithGPA).test(student))
                System.out.println(student);
        }));
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGPA();
        filterStudentByGradeLevelAndGPA();
        filterStudentByGradeLevelOrGPA();
    }
}
