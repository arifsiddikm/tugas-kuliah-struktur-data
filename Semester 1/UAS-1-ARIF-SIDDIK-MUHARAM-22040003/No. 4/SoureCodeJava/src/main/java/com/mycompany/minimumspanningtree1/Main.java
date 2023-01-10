/*
Nama : Arif Siddik Muharam 
NIM : 220040003 
Fakultas Ilmu Komputer - Teknik Informatika - Semester 1 
UAS - Struktur Data 
*/
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
        g.addEdge(3, 6, 7);
        g.addEdge(4, 5, 7);
        g.addEdge(5, 6, 6);
        g.getMST();
    }
}
