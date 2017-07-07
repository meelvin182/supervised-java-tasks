package Graph;


/**
 * Created by Artem Solomatin on 06.07.17.
 * SupervisedProjects
 *//*
public class GraphTest {
    public static void main(String[] args){
        Graph graph = new Graph();
        /*graph.addNode("A", 0);
        graph.addNode("B", 0);
        graph.addNode("C", 0);
        graph.addNode("D", 0);
        graph.addNode("E", 0);
        graph.addNode("F", 0);

        graph.addEdge(0, 1, 20);
        graph.addEdge(0, 2, 30);
        graph.addEdge(3, 4, 60);
        graph.addEdge(2, 6, 50);
        graph.addEdge(2, 4, 40);
        graph.addEdge(3, 5, 80);
        graph.addEdge(5, 6, 100);
        graph.addEdge(4, 6, 10);

        graph.path();
    }
}*/

public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A',10);
        graph.addVertex('B', 0);
        graph.addVertex('C', 100);
        graph.addVertex('D', 20);
        graph.addVertex('E', 5);

        graph.addEdge(0, 1, 50);
        graph.addEdge(0, 3, 80);
        graph.addEdge(1, 2, 60);
        graph.addEdge(1, 3, 90);
        graph.addEdge(2, 4, 40);
        graph.addEdge(3, 2, 20);
        graph.addEdge(3, 4, 70);
        graph.addEdge(4, 1, 50);

        graph.minPath(0, 4);
    }
}