package Stream;

import data.Student;
import data.StudentDataBase;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static List<String> getActivities(){
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(Collection::stream) //flatan data into provided Stream<String>
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getActivities());
    }
}
