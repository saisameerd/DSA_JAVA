public class getConnectedComponent {
    public static void getSingleComp(ArrayList<Edge>[] graph, int src, boolean [] vis, ArrayList<Integer> single){
        single.add(src);
        vis[src] = true;
        for(Edge e : graph[src]){
            int nbr = e.nbr;
            if(!vis[nbr]){
                getSingleComp(graph, nbr, vis, single);
            }
        }
    }
    
    public static void gcc(ArrayList<Edge>[] graph , ArrayList<ArrayList<Integer>> comps){
        boolean [] vis = new boolean[graph.length];
        
        for(int i = 0; i<graph.length; i++){
            //unvisited nbrs
            if(!vis[i]){
                ArrayList<Integer> single = new ArrayList<>();
                getSingleComp(graph, i, vis, single);
                comps.add(single);
                
            }
        }
    }
}
