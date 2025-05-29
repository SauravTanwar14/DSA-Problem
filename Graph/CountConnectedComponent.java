package Graph;

import java.util.ArrayList;

public class CountConnectedComponent {

    public static void main(String[] args) {

        int node = 9;

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        for (int i = 0; i < node; i++) {
            arrayLists.add(new ArrayList<>());
        }

        addEdge(arrayLists, 0, 1);
        addEdge(arrayLists, 1, 2);
       
        addEdge(arrayLists, 3, 4);
        addEdge(arrayLists, 4, 5);
        addEdge(arrayLists, 5, 6);
        
        addEdge(arrayLists, 7, 8);
        

        System.out.println("Adjaceny list");
        printGraph(arrayLists);

        // Count disconnected components
        int count = countConnectedComponent(arrayLists, node);
        System.out.println("\nNumber of Connected Components: " + count);
    }

    private static int countConnectedComponent(ArrayList<ArrayList<Integer>> arrayLists, int nodes) {

        int[] visited = new int[nodes];
        int count = 0;

        for (int i = 0; i < nodes; i++) {
            if (visited[i] == 0) {
                dfs(arrayLists, i, visited);
                count++;
            }
        }
        return count;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> arrayLists, int node, int[] visited) {

        visited[node] =1;

        for(int neighbour : arrayLists.get(node)){
            if(visited[neighbour]==0){
                dfs(arrayLists, neighbour, visited);
            }
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> arrayLists, int src, int destination) {

        arrayLists.get(src).add(destination);
        arrayLists.get(destination).add(src);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> arrayLists) {

        for (int i = 0; i < arrayLists.size(); i++) {
            
            for (int j : arrayLists.get(i)) {
                
            }
            
        }
    }

}
