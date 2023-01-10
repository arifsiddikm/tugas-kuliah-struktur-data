public class Main {
    public static void main(String[] args) {
        int v = 9;
        Graph g = new Graph(v);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 4, 3);
        g.addEdge(1, 5, 5);
        g.addEdge(2, 0, 3);
        g.addEdge(2, 3, 1);
        g.addEdge(3, 6, 7);
        g.getMST();
    }
}
