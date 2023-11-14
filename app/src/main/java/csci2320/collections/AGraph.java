package csci2320.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AGraph {
    int[][] matrix = {  {1,0,1,1},      //example of adjacency matrix
                        {0,0,1,0},
                        {0,0,0,1},
                        {0,1,0,0}};
    List<List <Integer>> alist = List.of(       //example of adjacency list
        List.of(0,2,3),
        List.of(2),
        List.of(3),
        List.of(1)
    );

    int[][] maze = {
        {0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,0,0,1,0,0,0},
        {0,1,0,0,0,1,1,1,1,0},
        {0,1,1,1,0,1,0,0,0,0},
        {0,0,0,1,0,1,0,0,0,0},
        {0,0,0,1,1,1,1,1,0,0},
        {0,1,0,1,0,0,0,1,0,0},
        {0,1,0,1,0,0,0,1,0,0},
        {0,1,1,1,0,0,0,1,1,0},
        {0,0,0,0,0,0,0,0,1,0}
    };

    public int recursiveDFSShort(int current, List<List<Integer>> adj, int end, Set<Integer> visited) {
        //base case
        if(current == end) {
            return 0;
        } else {
            //recursive part
            int min = 1000000000;
            Set<Integer> newVisited = new HashSet<Integer>(visited);
            newVisited.add(current);
            for (int dest: adj.get(current)) {
                if(!newVisited.contains(dest)) {
                    int dist = recursiveDFSShort(dest, adj, end, newVisited);
                    if(dist < min) {min = dist;}
                }
            }
            return min + 1;
        }        
    }
    
    public static AGraph emptyGraph() {
        //...
        return new AGraph();
    }
}