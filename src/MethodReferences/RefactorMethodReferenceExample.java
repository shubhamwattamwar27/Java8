package MethodReferences;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> studentPredicate = (s) -> s.getGradeLevel()>=3;

    public static boolean greaterGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }

    static Predicate<Student> studentPredicateWithMethodReference = RefactorMethodReferenceExample::greaterGradeLevel;

    public static void main(String[] args) {
        System.out.println(" Simple Student Predicate ="+studentPredicate.test(StudentDataBase.studentSupplier.get()));
        System.out.println(" Method Reference Student Predicate ="+studentPredicateWithMethodReference.test(StudentDataBase.studentSupplier.get()));
    }

}
