import java.util.ArrayList;
import java.util.HashMap;

public class UniversityEnrolmentSystem {
    private static final String y16s1 = "16s1";
    private static final String y16s2 = "16s2";
    private static final String y17s1 = "17s1";
    private static final String y17s2 = "17s2";
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private HashMap<String, HashMap<Student, Course>> enrolments;

    public UniversityEnrolmentSystem() {
        this.courses = new ArrayList<Course>();
        this.enrolments = new HashMap<>();
        this.enrolments.put(y16s1, new HashMap<Student, Course>());
        this.enrolments.put(y16s2, new HashMap<Student, Course>());
        this.enrolments.put(y17s1, new HashMap<Student, Course>());
        this.enrolments.put(y17s2, new HashMap<Student, Course>());
    }

    public boolean addCourse(String courseName){
        Course newCourse = new Course(courseName, this.courses.size());
        
        for (Course c : this.courses) {
            if (c.equals(newCourse)) {
                // course already exists
                return false;
            }
        }

        try {
            this.courses.add(newCourse);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean removeCourse(String courseName) {
        Course courseToRemove = getCourse(courseName);
        if (courseToRemove != null) {
            this.courses.remove(courseToRemove);
            return true;
        }
        return false;
    }

    public boolean enrolStudent(String year, String courseName, int id) {
        Course courseToBeEnrolledInto = getCourse(courseName);
        Student studentToBeEnrolled = getStudentByID(id);
        HashMap<Student, Course> semesterToBeEnrolled = this.enrolments.get(year);
        if (havePrerequisitesBeenCovered(studentToBeEnrolled, courseToBeEnrolledInto)) {
            semesterToBeEnrolled.put(studentToBeEnrolled, courseToBeEnrolledInto);
            return true;
        } else {
            return false;
        }
    }
    public boolean unenrolStudent(int id, String courseName) {
        return false;
    }

    private Course getCourse(String courseName) {
        for (Course c : this.courses) {
            if (c.getCourseName().equals(courseName)) {
                return c;
            }
        }
        return null;
    }
    
    private Student getStudentByID(int id) {
        for (Student s : this.students) {
            if (s.getStudentNumber() == id) {
                return s;
            }
        }
        return null;
    }

    private Student getStudentByName(String name) {
        for (Student s : this.students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    private boolean havePrerequisitesBeenCovered(Student studentNumber, Course c) {
        ArrayList<Course> allPrereqs = new ArrayList<>();
        ArrayList<Course> toAdd = new ArrayList<>();
        for (Course rootLevelDependency : c.getPrereqs()) {
            if (!toAdd.contains(rootLevelDependency)) {
                toAdd.add(rootLevelDependency);
            }
        }
        Course currentlyBeingChecked = null;
        while (!toAdd.isEmpty()) {
            currentlyBeingChecked = toAdd.get(0);            
            if (!toAdd.contains(currentlyBeingChecked)) {
                toAdd.add(currentlyBeingChecked);
            }
            allPrereqs.add(currentlyBeingChecked);
        }
        


        return false;
    }
}
