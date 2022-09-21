package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> studentSupplier = ()-> { return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));};

    static Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        System.out.println("Student is = "+studentSupplier.get());

        System.out.println("All Student is = "+listSupplier.get());
    }
}
