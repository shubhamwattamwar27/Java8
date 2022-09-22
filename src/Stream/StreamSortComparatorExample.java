package Stream;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import FunctionalInterface.SupplierExample;

public class StreamSortComparatorExample {

    public static List<Student> getSortedStudentByName()
    {
        return SupplierExample.listSupplier.get().stream() // Stream<Student>
                .sorted(Comparator.comparing(Student::getName)) // sort it with Student Name Stream<Student>
                .collect(Collectors.toList()); // convert to List<Student>
    }

    public static List<Student> getSortedStudentByGpa()
    {
        return SupplierExample.listSupplier.get().stream() // Stream<Student>
                .sorted(Comparator.comparing(Student::getGpa)) // sort it with Student GPA Stream<Student>
                .collect(Collectors.toList()); // convert to List<Student>
    }

    public static List<Student> getSortedStudentByGpaInDesc()
    {
        return SupplierExample.listSupplier.get().stream() // Stream<Student>
                .sorted(Comparator.comparing(Student::getGpa).reversed()) // sort it with Student GPA Stream<Student>
                .collect(Collectors.toList()); // convert to List<Student>
    }

    public static void main(String[] args) {

        System.out.println("getSortedStudentByName="+getSortedStudentByName());
        System.out.println("getSortedStudentByGpa="+getSortedStudentByGpa());
        System.out.println("getSortedStudentByGpaInDesc="+getSortedStudentByGpaInDesc());
    }
}
