package Stream;

import data.StudentDataBase;

public class StreamMatchExample {

    public static boolean allMatch()
    {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3);
    }

    public static boolean anyMatch()
    {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=3.9);
    }

    public static boolean nonMatch()
    {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=3.1);
    }

    public static void main(String[] args) {

        System.out.println("Result of allMatch = "+allMatch());
        System.out.println("Result of anyMatch = "+anyMatch());
        System.out.println("Result of nonMatch = "+nonMatch());
    }
}
