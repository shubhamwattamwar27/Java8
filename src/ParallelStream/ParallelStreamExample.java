package ParallelStream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ParallelStreamExample {

    public static void main(String[] args) {
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);

        List<Student> studentList = StudentDataBase.getAllStudents();

        Map<String,List<String>> studentNameToActivitiesMap =
                studentList.parallelStream().collect(Collectors.toMap(Student::getName,Student::getActivities));

        Map<String,List<String>> studentNameToActivitiesMapWithGapFilter =
                studentList.parallelStream().filter(studentPredicate) // provide Stream<Student>
                        .collect(Collectors.toMap(Student::getName,Student::getActivities)); // provide Map<String,List<String>>

        System.out.println("studentNameToActivitiesMap with Parallel Stream= " + studentNameToActivitiesMap);

        System.out.println("studentNameToActivitiesMapWithGapFilter with Parallel Stream= " + studentNameToActivitiesMapWithGapFilter);
    }
}
