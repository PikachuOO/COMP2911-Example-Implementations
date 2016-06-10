import java.util.ArrayList;

public class Graph {
    private int size;
    private ArrayList<Node> nodes;

    public Graph() {
        this.size = 0;
        this.nodes = new ArrayList<Node>();
    }

    public void add(Node node) {
        if (!this.contains(node)) {
            this.nodes.add(node);
            this.size++;
        }
    }

    public void remove(Node node) {
        if (this.nodes.remove(node)) {
            this.size--;
        }
    }
    
    public boolean contains(Node node) {
        for (Node collectionNodes : this.nodes) {
            if (collectionNodes.equals(node)) {
                return true;
            }
        }
        return false;
    }
    
    public int getSize() {
        return this.size;
    }

    public boolean addConnection(Node from, Node to) {
        try {
            if (to.createConnection(from) && from.createConnection(to)) {
                // System.out.println("adding connection");
                return true;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void printGraph() {
        int xCounter = 0;
        int yCounter = 0;
        Node node = null;
        Node connection = null;
        System.out.format("\t\t");
        for (Node heading : this.nodes) {
            System.out.format("%s\t", heading.getData());
        }
        System.out.format("\n");
        while (xCounter < this.size) {
            node = this.nodes.get(xCounter);
            yCounter = 0;
            System.out.format("%s\t\t", node.getData());
            while (yCounter < this.size) {
                connection = this.nodes.get(yCounter);
                if (xCounter == yCounter) {
                    System.out.format("-\t");
                } else if (node.isConnectedTo(connection)) {
                    System.out.format("1\t");
                } else {
                    System.out.format("0\t");
                }
                yCounter++;
            }
            xCounter++;
            System.out.format("\n");
        }
    }
}
