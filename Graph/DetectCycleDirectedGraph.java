package Graph;

import java.util.ArrayList;

public class DetectCycleDirectedGraph {
    public static boolean dfs(ArrayList<ArrayList<Integer>> arrayLists,int V){
        boolean [] visited = new boolean[V];
        boolean [] recSt = new boolean[V];

        for(int i=0;i<V;i++){
            if(visited[i]==false)
                if(dfsRec(arrayLists,i,visited,recSt)==true)
                    return true;
        }
        return false;
    }

    public static boolean dfsRec(ArrayList<ArrayList<Integer>> arrayLists,int node ,boolean[] visited,boolean [] recSt){
        visited[node] = true;
        recSt[node] = true;

        for(int neighbor : arrayLists.get(node)){
            if(visited[neighbor]==false && dfsRec(arrayLists,neighbor,visited,recSt)==true){
                return true;
            }else if(recSt[node]==true)
                return  true;
        }
        recSt[node]=false;
        return false;

    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,2,1);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,5,3);

        if(dfs(adj,V)==true)
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");
    }
}
