public class hamiltonPathorCycle {
    public void pathOrCycle(ArrayList<Edge>graph , boolean[] vis , int src , int osrc , String asf){

        if(asf.length() == graph.length){
            System.out.println(asf);

            for(Edge e : graph[osrc]){
                int nbr = e.nbr ;

                if(nbr == src){
                    System.out.println("cycle");
                    return ;

                }


            }

            System.out.println("path");
            return ;
        }



        vis[src] = true ;

        for(Edge e: graph[src]){
            int nbr = e.nbr;
            if(!vis[src]){
                pathOrCycle(graph, vis, nbr, osrc, asf + nbr);

            }
        }

        vis[src] = false ;
    }
}
