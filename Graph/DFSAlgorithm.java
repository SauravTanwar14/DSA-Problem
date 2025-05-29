package Graph;

import java.util.ArrayList;

public class DFSAlgorithm {
    public static void main(String[] args) {
        int nodes = 8;  // Number of nodes
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

        System.out.println("\nDFS Traversal:");
        dfsTraversal(arrayLists, nodes);
    }

    // ✅ Function to add edges
    private static void addEdge(ArrayList<ArrayList<Integer>> arrayLists, int source, int destination) {
        arrayLists.get(source).add(destination);
        arrayLists.get(destination).add(source);
    }

    // ✅ Wrapper Function for DFS
    private static void dfsTraversal(ArrayList<ArrayList<Integer>> arrayLists, int nodes) {
        int[] visited = new int[nodes]; // Initialize visited array
        for (int i = 0; i < nodes; i++) {
            if (visited[i] == 0) { // If the node is not visited, start a DFS
                dfs(arrayLists, i, visited);
            }
        }
    }

    // ✅ DFS Recursive Function
    private static void dfs(ArrayList<ArrayList<Integer>> arrayLists, int node, int[] visited) {
        visited[node] = 1;
        System.out.print(node + " ");

        for (int neighbor : arrayLists.get(node)) {
            if (visited[neighbor] == 0) {
                dfs(arrayLists, neighbor, visited);
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


