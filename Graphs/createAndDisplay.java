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

    public static void display(ArrayList<Edge>[] graph , int n){
        for(int  i = 0 ; i< n ;i++){
            System.out.print(i + " --> ");
            for(Edge e : graph[i]){
                int u = e.src;
                int v = e.nbr;
                int w = e.wt;

                System.out.print( u + " - " + v + " @ " + w + " , ");
            }

            System.out.println();
        }
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

        display(graph , N);

/* 
0 --> 0 - 1 @ 10 , 0 - 3 @ 10 , 
1 --> 0 - 1 @ 10 , 1 - 2 @ 10 , 
2 --> 1 - 2 @ 10 , 2 - 3 @ 40 , 
3 --> 0 - 3 @ 10 , 2 - 3 @ 40 , 3 - 4 @ 2 , 
4 --> 3 - 4 @ 2 , 4 - 5 @ 2 , 4 - 6 @ 8 , 
5 --> 4 - 5 @ 2 , 5 - 6 @ 3 , 
6 --> 5 - 6 @ 3 , 4 - 6 @ 8 , 

[Done] exited with code=0 in 0.966 seconds
*/
    }

    public static void main(String[] args) {
        construction();
    }
}