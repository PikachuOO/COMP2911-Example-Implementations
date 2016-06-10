import java.util.ArrayList;

public interface Node {
    String getData();
    boolean equals(Node n);
    ArrayList<Node> getConnections(Node n);
    boolean isConnectedTo(Node n);
    boolean createConnection(Node n);
}
