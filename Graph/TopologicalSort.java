package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(V);

        for(int i=0;i<V;i++){
            arrayList.add(new ArrayList<>());
        }

        addEdge(arrayList,0, 2);
        addEdge(arrayList,0, 3);
        addEdge(arrayList,1, 3);
        addEdge(arrayList,1, 4);
        addEdge(arrayList,2, 3);

        System.out.println("Following is a Topological Sort of");
        topologicalSort(arrayList,V);
    }

    private static void topologicalSort(ArrayList<ArrayList<Integer>> arrayList, int V) {


        int [] in_degree = new int[V];

        //calculate in-degree of very vertex
        for(int i =0;i<V;i++){
            for(int x : arrayList.get(i)){
                in_degree[x]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        //add all vertex having 0 in-degree
        for(int i=0;i<V;i++){
            if(in_degree[i]==0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current+" ");

            for(int neighbhor : arrayList.get(current)){
                if(--in_degree[neighbhor]==0){//reduce in-degree by v by 1
                    queue.add(neighbhor);
                }
            }
        }
    }

    public static  void addEdge(ArrayList<ArrayList<Integer>> arrayList,int u , int v){
        arrayList.get(u).add(v); //adding only u->v because graph is directed
    }
}
