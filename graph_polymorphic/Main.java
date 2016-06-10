public class Main {
    public static void main (String[] args) {
        Graph g = new Graph();
        MyGraphNode one = new MyGraphNode("memes");
        MyGraphNode two = new MyGraphNode("dank");
        MyGraphNode three = new MyGraphNode("trump");
        MyGraphNode four = new MyGraphNode("gus");
        MyGraphNode five = new MyGraphNode("gavin");
        MyGraphNode six = new MyGraphNode("barbara");
        MyGraphNode seven = new MyGraphNode("barbara");
        g.add(one); g.add(two);
        g.add(three); g.add(four);
        g.add(five); g.add(six); g.add(seven);
        g.addConnection(one, two);
        g.addConnection(two, six);
        g.addConnection(three, five);
        g.printGraph();
    }
}
