public class perfectFriends {
    public static void solve(ArrayList<Edge>[] graph){
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      
        gcc(graph, comps);
        
        int ans = 0;
        for(int i = 0; i<comps.size(); i++){
            for(int j = i+1; j < comps.size(); j++){
                int size1 = comps.get(i).size();
                int size2 = comps.get(j).size();
                
                ans += size1 * size2;
            }
        }
}
