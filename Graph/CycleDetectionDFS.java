package Graph;

import java.util.ArrayList;
import java.util.List;

public class CycleDetectionDFS {

    private List<List<Integer>> adjList;

    public CycleDetectionDFS(int vertices){
        adjList = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src,int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public boolean hasCycle(){
        boolean [] visited = new boolean[adjList.size()];

        for(int i=0;i<adjList.size();i++){
            if(!visited[i]){
                if(dfs(i,-1,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int node, int parent, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited)) {
                    return true;
                }
            } else if (neighbor != parent) { // If visited & not parent → Cycle found
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetectionDFS graph = new CycleDetectionDFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2); // Cycle here

        if (graph.hasCycle()) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle found.");
        }
    }
}
