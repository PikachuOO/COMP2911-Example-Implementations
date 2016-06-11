import java.util.ArrayList;

public class Student {
    private int studentNumber;
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public String getName() {
        return this.name;
    }
}
