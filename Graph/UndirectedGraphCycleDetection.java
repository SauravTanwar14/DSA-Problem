package Graph;

import java.util.*;

public class UndirectedGraphCycleDetection {

    // Function to detect a cycle in an undirected graph using DFS
    public static boolean isCyclePresent(int V, List<List<Integer>> adj) {
        // Create a visited array to keep track of visited nodes
        boolean[] visited = new boolean[V];

        // Iterate through all vertices.  This is important for disconnected graphs.
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                // If a node hasn't been visited, start a DFS from it
                if (isCyclePresentDFS(i, -1, visited, adj)) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle found
    }

    // Recursive DFS function to detect cycles
    private static boolean isCyclePresentDFS(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true; // Mark the current node as visited

        // Explore all the neighbors of the current node
        for (Integer neighbor : adj.get(node)) {
            // If the neighbor has not been visited
            if (!visited[neighbor]) {
                // Recursively call DFS on the neighbor, with the current node as its parent
                if (isCyclePresentDFS(neighbor, node, visited, adj)) {
                    return true; // Cycle detected in the recursive call
                }
            }
            // If the neighbor has been visited and is not the parent of the current node
            else if (neighbor != parent) {
                // This indicates a back edge, which means a cycle exists
                return true;
            }
        }
        return false; // No cycle found in this DFS traversal
    }

    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        int V = 5; // Number of vertices
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph (undirected edges)
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 1); // This edge creates a cycle
        addEdge(adj, 4, 0);  // disconnected part.

        //addEdge(adj, 0, 4); // adding this edge will create a cycle 0-4-3-1-0


        // Check if a cycle exists
        if (isCyclePresent(V, adj)) {
            System.out.println("Cycle is present in the graph");
        } else {
            System.out.println("Cycle is not present in the graph");
        }
    }

    // Helper function to add an undirected edge to the graph
    private static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}


