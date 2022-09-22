package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationExamples {

    public static List<String> getUniqueActivitiesFromStudentList()
    {
        return FlatMapExample.getActivities().stream().distinct().collect(Collectors.toList());
    }

    public static long countOfStudentActivities()
    {
        return FlatMapExample.getActivities().stream().distinct().count();
    }

    public static List<String> sortedStudentActivities(){
        return FlatMapExample.getActivities().stream().distinct().sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("getUniqueActivitiesFromStudentList=" + getUniqueActivitiesFromStudentList());
        System.out.println("countOfStudentActivities=" + countOfStudentActivities());
        System.out.println("sortedStudentActivities=" + sortedStudentActivities());
    }
}
