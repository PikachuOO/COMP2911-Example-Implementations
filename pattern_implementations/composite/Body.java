import java.util.ArrayList;

public class Body extends CarAssembly {
    
    protected String COMPONENT_NAME = "Body";

    @Override
    public boolean addAssembly(Assembly a) {
        return super.addAssembly(a);    
    }

    @Override
    public ArrayList<Assembly> getChildren() {
        return super.getChildren();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getAssemblyName() {
        return this.COMPONENT_NAME;
    }
}
