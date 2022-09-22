package Stream;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceFilterExample {

    public static int getNoOfNotebooks()
    {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3)    //filter student who is having great GPA than 3
                .map(Student::getNoOfNotebooks)
                //.reduce(0,(a, b) -> Integer.sum(a,b));
                //.reduce(0,(a, b) -> a+b);
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("getNoOfNotebooks="+getNoOfNotebooks());
    }
}
