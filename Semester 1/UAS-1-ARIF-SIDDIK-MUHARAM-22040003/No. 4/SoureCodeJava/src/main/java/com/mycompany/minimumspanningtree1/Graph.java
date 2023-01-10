import java.text.NumberFormat;
import java.util.LinkedList;

class Graph {
    // num of vertices (towns) in the graph
    int v;
    // list of adjacent nodes of a given vertex
    LinkedList<Edge>[] adjacencyList;

    // constructor for the graph object
    Graph(int v) {
        // number og vertices
        this.v = v;
        // initialize a new LinkedList with v positions
        adjacencyList = new LinkedList[v];
        // for every vertex create a new LinkedList
        for (int i = 0; i < v; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // add edge to the adj list
    public void addEdge(int src, int dest, int weight) {
        Edge edge = new Edge(src, dest, weight);
        adjacencyList[src].addFirst(edge);
        // for undirected graph, so it goes both ways
        edge = new Edge(dest, src, weight);
        adjacencyList[dest].addFirst(edge);
    }

    //
    public void getMST() {
        // init an inHeap array of type boolean of size v
        boolean[] inHeap = new boolean[v];
        // init a resultSet array of size v
        ResultSet[] resultSet = new ResultSet[v];
        // init a key array of type int of size v
        int[] key = new int[v];
        // init a heapNodes array of size v
        HeapNode[] heapNodes = new HeapNode[v];

        // for every index in the array of size v
        for (int i = 0; i < v; i++) {
            // fill array heapNodes with HeapNodes, where
            // vertex is index, and key is infinite
            heapNodes[i] = new HeapNode();
            heapNodes[i].vertex = i;
            heapNodes[i].key = Integer.MAX_VALUE;
            // fill array resultSet, where parent is -1
            resultSet[i] = new ResultSet();
            resultSet[i].parent = -1;
            // ????? indicate that the node is inside the heap
            inHeap[i] = true;
            // ?????
            key[i] = Integer.MAX_VALUE;
        }

        // the starting node's key is set to 0, it doesn't have a source
        heapNodes[0].key = 0;

        // add all the vertices to the minHeap
        // init minHeap with the size of number of towns
        MinHeap minHeap = new MinHeap(v);
        // add all the vertices to priority queue
        for (int i = 0; i < v; i++) {
            minHeap.insert(heapNodes[i]);
        }

        // while minHeap is not empty
        while (!minHeap.isEmpty()) {
            HeapNode extractedNode = minHeap.extractMin();

            // extracted vertex
            int extractedVertex = extractedNode.vertex;
            inHeap[extractedVertex] = false;

            // iterate through all the adj vertices
            LinkedList<Edge> list = adjacencyList[extractedVertex];
            for (int i = 0; i < list.size(); i++) {
                Edge edge = list.get(i);
                // only if edge destination is present in heap
                if (inHeap[edge.dest]) {
                    int dest = edge.dest;
                    int newKey = edge.weight;

                    // check if the ?????
                    if (key[dest] > newKey) {
                        decreaseKey(minHeap, newKey, dest);
                        // update the parent node for destination
                        resultSet[dest].parent = extractedVertex;
                        resultSet[dest].weight = newKey;
                        key[dest] = newKey;
                    }
                }
            }
        }

        // print Minimum Spanning Tree
        printMST(resultSet);
    }

    public void decreaseKey(MinHeap minHeap, int newKey, int vertex) {
        // get the index which key's needs a decrease
        int index = minHeap.indexes[vertex];

        // get the node and update its value
        HeapNode node = minHeap.minH[index];
        node.key = newKey;
        minHeap.moveUp(index);
    }

    public void printMST(ResultSet[] resultSet) {
        int total_min_weight = 0;
        // create a new array to exchange the values of type int with names of the towns
        String[] towns = new String[v];
        towns[0] = "A";
        towns[1] = "B";
        towns[2] = "C";
        towns[3] = "D";
        towns[4] = "E";
        towns[5] = "F";
        towns[6] = "G";
        towns[7] = "H";

        System.out.println("Minimum Spanning Tree: ");
        // print every edge of minimum spanning tree and calculate the total distance
        for (int i = 1; i < v; i++) {
            System.out.println("Edge: " + towns[i] + " - " + towns[resultSet[i].parent] + " km: " + resultSet[i].weight);
            total_min_weight += resultSet[i].weight;
        }
        System.out.println("Total minimum km: " + total_min_weight);
        // 100 DKK per 1m
        int total_price = total_min_weight * 100 * 1000;
        // set format of the number
        NumberFormat myFormat = NumberFormat.getInstance();
        System.out.println("The total price is: " + myFormat.format(total_price) + " DKK");
    }
}