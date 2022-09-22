package Stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//map is used to convert one type to other
//Map can be use for performing operations as well
public class StreamsMapExample {


    public static List<String> getNameList(){
        return StudentDataBase.getAllStudents().stream() //provide Stream<Student>
                .map(Student::getName) // convert Student list to name list output is Stream<String>
                .map(s -> s.toUpperCase()) // perform operation on names output is Stream<String>
                .collect(Collectors.toList());
    }

    public static Set<String> getNameSet(){
        return StudentDataBase.getAllStudents().stream() //provide Stream<Student>
                .map(Student::getName) // convert Student list to name list output is Stream<String>
                .map(s -> s.toUpperCase()) // perform operation on names output is Stream<String>
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        System.out.println("List"+getNameList());

        System.out.println("Set"+getNameSet());
    }
}
