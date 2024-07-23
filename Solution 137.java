class Solution {
    public void solve(Node root,List<Integer>ls){
        if(root==null)return;
        solve(root.left,ls);
        ls.add(root.data);
        solve(root.right,ls);
    }
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer>ls1=new ArrayList<>();
        List<Integer>ls2=new ArrayList<>();
         List<Integer>ans=new ArrayList<>();
        solve(root1,ls1);
        solve(root2,ls2);
        int n=ls1.size();int m=ls2.size();int i=0;int j=0;
        while(i<n || j<m){
            if(i<n && j<m && ls2.get(j)>=ls1.get(i)){
                ans.add(ls1.get(i++));
            }
            else if(i<n && j<m && ls2.get(j)<ls1.get(i)){
                ans.add(ls2.get(j++));
            }
            else if(i<n){
                 ans.add(ls1.get(i++));
            }
            else{
                 ans.add(ls2.get(j++));
            }
        }
        return ans;
    }
}
