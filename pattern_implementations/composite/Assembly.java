import java.util.ArrayList;

public interface Assembly {
    boolean addAssembly(Assembly a);
    ArrayList<Assembly> getChildren();
    String toString();
}
