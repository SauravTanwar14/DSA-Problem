package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSAlogrithm {
    public static void main(String[] args) {
        int nodes = 8;  // Increase this to accommodate all nodes
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < nodes; i++) {
            arrayLists.add(new ArrayList<>());
        }

        // Add edges
        addEdge(arrayLists, 0, 1);
        addEdge(arrayLists, 0, 2);
        addEdge(arrayLists, 1, 3);
        addEdge(arrayLists, 1, 4);
        addEdge(arrayLists, 2, 5);
        addEdge(arrayLists, 2, 6);
        addEdge(arrayLists, 3, 7);
        addEdge(arrayLists, 4, 7);
        addEdge(arrayLists, 5, 7);
        addEdge(arrayLists, 6, 7);

        System.out.println("Adjacency List:");
        printGraph(arrayLists);

        System.out.println("\nBFS Traversal:");
        bfs(arrayLists, 0, nodes);
    }

    // ✅ Fixed addEdge function
    private static void addEdge(ArrayList<ArrayList<Integer>> arrayLists, int source, int destination) {
        arrayLists.get(source).add(destination);
        arrayLists.get(destination).add(source);
    }

    // ✅ BFS Algorithm
    private static void bfs(ArrayList<ArrayList<Integer>> arrayLists, int v, int nodes) {
        boolean[] visited = new boolean[nodes];  // Use boolean instead of int[0/1]
        Queue<Integer> queue = new LinkedList<>();

        queue.add(v);
        visited[v] = true;
        System.out.print(v + " ");

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : arrayLists.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    System.out.print(neighbor + " ");
                }
            }
        }
    }

    // ✅ Print Graph
    private static void printGraph(ArrayList<ArrayList<Integer>> arrayLists) {
        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.print(i + " -> ");
            for (int j : arrayLists.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
