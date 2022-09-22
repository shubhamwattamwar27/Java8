package Stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DebugStreamWithPeekExample {

    public static void main(String[] args) {
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);

        List<Student> studentList = StudentDataBase.getAllStudents();

        Map<String,List<String>> studentNameToActivitiesMap =
                studentList.stream().collect(Collectors.toMap(Student::getName,Student::getActivities));

        Map<String,List<String>> studentNameToActivitiesMapWithGapFilter =
                studentList.stream().
                        peek(student -> {
                            System.out.println(student);
                        })
                        .filter(studentPredicate) // provide Stream<Student>
                        .peek(student -> { // peek is used to debug the data in Stream
                            System.out.println("After 1st Filter =" +student);
                        })
                        .collect(Collectors.toMap(Student::getName,Student::getActivities)); // provide Map<String,List<String>>

                        System.out.println("studentNameToActivitiesMap = " + studentNameToActivitiesMap);

                        System.out.println("studentNameToActivitiesMapWithGapFilter = " + studentNameToActivitiesMapWithGapFilter);
    }
}
