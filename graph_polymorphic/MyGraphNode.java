import java.util.ArrayList;

public class MyGraphNode implements Node {
    private ArrayList<Node> connections;
    private String data;
    
    public MyGraphNode(String data) {
        this.data = data;
        this.connections = new ArrayList<Node>();
    }

    public String getData() {
        return this.data;
    }

    public boolean equals(Node n) {
         // System.out.format("comparing [%s] to [%s] == %s\n", this.data, n.getData(), Boolean.toString(this.data.equals(n.getData())));
        if (this.data.equals(n.getData())) {
            // System.out.println("FOUND A MATCH");
            return true;
        }
        return false;
    }

    public int amtConnections() {
        return this.connections.size();
    }

    public ArrayList<Node> getConnections(Node n) {
        return this.connections;
    }

    public boolean isConnectedTo(Node n) {
        for (Node connection : this.connections) {
            if (connection.equals(n)) {
                return true;
            }
        }
        return false;
    }

    public boolean createConnection(Node n) {
        if (this.isConnectedTo(n)) {
            return false;
        } else {
            // connection doesn't exist
            this.connections.add(n);
            return true;
        }
    }
}
