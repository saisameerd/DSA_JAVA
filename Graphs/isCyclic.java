import java.util.ArrayList;
import java.util.Queue;

public class isCyclic {

    public boolean isCycle(ArrayList<Edge>graph , int src , boolean[] vis) {
        Queue<Integer>qu = new LinkedList<>();

        qu.add(src);

        while(qu.size() != 0){
            int rem = qu.remove();

            if(vis[rem]){
                return true;
            }
            
            vis[rem] = true;
                for(Edge e : graph[src]){
                    int nbr = e.nbr ;

                    if(!vis[nbr]){
                        qu.add(nbr);
                    }
                }
            
            
        }

        return false;
    }
// apply thiis for every vertice in main function

   
}
