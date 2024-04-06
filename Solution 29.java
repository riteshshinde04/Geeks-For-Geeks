class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[] = new boolean[V];
        boolean recs[] = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,recs)){
                    return true;
                }
            }
        }
        return false;
    }
    
    static boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] recs){
        
        vis[v]=true;
        recs[v]=true;
        
        for(int nbr:adj.get(v)){
            if(!vis[nbr]){
                if(dfs(nbr,adj,vis,recs)){
                    return true;
                }
            }
            else if(recs[nbr]){
                return true;
            }
        }
        recs[v]=false;
        return false;
    }
}