class Tree
{
     ArrayList<Integer> arr = new ArrayList<>();
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
        solve(root, k, 0);
        return arr;
     }
     
     void solve(Node root, int k, int i){
         if(root == null) return;
         if(i == k){
             arr.add(root.data);
             return;
         }
         solve(root.left, k, i+1);
         solve(root.right, k, i+1);
     }
}
