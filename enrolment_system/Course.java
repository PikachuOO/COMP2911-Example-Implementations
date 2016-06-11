import java.util.ArrayList;

public class Course {
    private String name;
    private int id;
    private ArrayList<Course> prereqs;

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
        this.prereqs = new ArrayList<Course>();
    }

    public boolean addPrerequisites(Course c) {
        for (Course pre : this.prereqs) {
            if (pre.equals(c)) {
                return false;
            }   
        }
        // not already a prereq
        try {
            this.prereqs.add(c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removePrerequisites(Course c) {
        return this.prereqs.remove(c);
    }
    
    public boolean equals(Course c) {
        if (this.name.equals(c.getCourseName())) {
            return true;
        } else {return false;}
    }

    public String getCourseName() {
        return this.name;
    }

    public ArrayList<Course> getPrereqs() {
        return this.prereqs;
    }
}
