import java.util.ArrayList;

public class CarAssembly implements Assembly {
    private ArrayList<Assembly> children;
    protected String COMPONENT_NAME = "CarAssembly";

    public CarAssembly () {
        this.children = new ArrayList<Assembly>();
    }

    @Override
    public boolean addAssembly(Assembly a) {
        try {
            this.children.add(a);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<Assembly> getChildren() {
        return this.children;
    }

    @Override
    public String toString() {
        String returnStatement = "";
        if (this.children.size() > 0) {
            returnStatement += this.getAssemblyName() + " has components: ";
            int counter = 0;
            for (Assembly a : this.children) {
                if (counter == this.children.size() - 1) {
                    returnStatement += a.toString();
                } else {
                    returnStatement += a.toString() + ", ";
                }
                counter++;
            }
        } else {
            returnStatement = this.getAssemblyName();
        }
        return returnStatement;
    }

    public String getAssemblyName() {
        return this.COMPONENT_NAME;
    }
}
