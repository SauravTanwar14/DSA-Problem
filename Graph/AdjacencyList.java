package Graph;

import java.util.ArrayList;

public class AdjacencyList {

    public static void main(String[] args) {

        int v = 8;
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>(v);

        for (int i = 0; i < v; i++) {
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

        System.out.println("Adjacency List");
        printGraph(arrayLists);

    }

    private static void addEdge(ArrayList<ArrayList<Integer>> arrayLists, int i, int j) {
        arrayLists.get(i).add(j);
        arrayLists.get(j).add(i);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> arrayLists) {

        for(int i =0 ;i<arrayLists.size();i++){
            System.out.print(i+"->");
            for(int j : arrayLists.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
