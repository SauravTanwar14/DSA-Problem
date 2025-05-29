package Graph;

import java.util.*;

class BipartiteGraphDFS {
    private List<List<Integer>> adjList;

    public BipartiteGraphDFS(int vertices) {
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public boolean isBipartite() {
        int[] colors = new int[adjList.size()];
        Arrays.fill(colors, -1); // Initialize all nodes as uncolored

        for (int i = 0; i < adjList.size(); i++) {
            if (colors[i] == -1) { // Unvisited node
                if (!dfs(i, 0, colors)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfs(int node, int color, int[] colors) {
        colors[node] = color; // Assign color

        for (int neighbor : adjList.get(node)) {
            if (colors[neighbor] == -1) { // Not colored yet
                if (!dfs(neighbor, 1 - color, colors)) {
                    return false;
                }
            } else if (colors[neighbor] == colors[node]) { // Conflict detected
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BipartiteGraphDFS graph = new BipartiteGraphDFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        
        if (graph.isBipartite()) {
            System.out.println("Graph is Bipartite.");
        } else {
            System.out.println("Graph is NOT Bipartite.");
        }
    }
}

