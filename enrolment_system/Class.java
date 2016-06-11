import java.util.ArrayList;

public class Class {
    private String name;
    private int id;
    private ClassTime start;
    private ClassTime finish;

    public Class(String name, int id, ClassTime start, ClassTime finish) {
        this.name = name;
        this.id = id;
        this.start = start;
        this.finish = finish;
    }

    public ClassTime getStartTime() {
        return this.start;
    }
    
    public ClassTime getEndTime() {
        return this.finish;
    }
}
