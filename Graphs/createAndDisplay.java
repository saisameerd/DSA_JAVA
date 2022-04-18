import java.util.*;

public class createAndDisplay {
    public static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src , int nbr , int wt){
            this.src = src ;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    // u is starting point and v is ending point aand wt is weigth of the edge 
    // edge ------>  undirected can go from  u to v and v to u 

    public static void addEdge (ArrayList<Edge>[] graph , int u ,int  v , int w){
       graph[u].add(new Edge(u, v, w));
       graph[v].add(new Edge(u, v, w));
    }

    public static void construction(){
        int N = 7;

        ArrayList<Edge>[] graph = new ArrayList[N];

        // graph ---------------->  ( ARRAY ---> ARRAYLIST -----> EDGE ------> SRC , NBR , WT )

        for(int i=0 ; i < N ; i++  ){
            graph[i] = new ArrayList<>();
        }

        addEdge(graph, 0 , 1, 10);
        addEdge(graph, 0 , 3, 10);
        addEdge(graph, 1 , 2, 10);
        addEdge(graph, 2 , 3, 40);
        addEdge(graph, 3 , 4, 2);
        addEdge(graph, 4 , 5, 2);
        addEdge(graph, 5 , 6, 3);
        addEdge(graph, 4 , 6, 8);

        
    }

    public static void main(String[] args) {
        construction();
    }
}