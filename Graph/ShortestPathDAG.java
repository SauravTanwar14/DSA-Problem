package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class ShortestPathDAG {

    public static void topologicalSort(ArrayList<ArrayList<Integer>> arrayLists,int V){
        Boolean visited[] = new Boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<V;i++){
            visited[i] = false;
        }

        for(int i=0;i<V;i++){
            if(!visited[i]==false){
                dfs(arrayLists,i,visited,stack);
            }
        }

        while(stack.isEmpty()==false){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj,int u,Boolean visited[],Stack<Integer> st){
        visited[u] = true;
        for(int v:adj.get(u)){
            if(visited[v]==false)
                dfs(adj,v,visited,st);
        }
        st.push(u);
    }

    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 1);
        addEdge(adj,1, 3);
        addEdge(adj,2, 3);
        addEdge(adj,3, 4);
        addEdge(adj,2, 4);

        System.out.println("Following is a Topological Sort of");
        topologicalSort(adj,V);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
    }
}
