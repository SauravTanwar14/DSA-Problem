package Graph;

import java.util.ArrayList;

public class DetectCycleUnirectedGraph {

    public static boolean dfs(ArrayList<ArrayList<Integer>> arrayLists,int v){
        boolean [] visited =new boolean[v];

        for(int i=0;i<v;i++){
            if(visited[i]==false){
                if(dfsRec(arrayLists,i,visited,-1)==true)
                    return true;
            }
        }
        return false;

    }

    public static boolean dfsRec(ArrayList<ArrayList<Integer>> arrayLists,int node, boolean [] visited,int parent){

        visited[node] = true;

        for(int neighbor : arrayLists.get(node)){
            if(visited[neighbor]==false){
                if(dfsRec(arrayLists,neighbor,visited,node)==true)
                    return true;
            }else if(node != parent){
                return true;
            }
        }
        return false;


    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
        addEdge(adj,1,3);
        addEdge(adj,2,3);

        if(dfs(adj,V)==true)
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");
    }



}
