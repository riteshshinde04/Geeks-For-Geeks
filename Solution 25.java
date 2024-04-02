class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, -1))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent) {
        vis[v] = true;
        for (int u : adj.get(v)) {
            if (!vis[u]) {
                if (dfs(u, adj, vis, v))
                    return true;
            } else if (u != parent)
                return true;
        }
        return false;
    }
}