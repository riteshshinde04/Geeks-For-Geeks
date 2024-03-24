//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> a = new ArrayList<>();
      if(root == null)
        return a;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.isEmpty() == false){
            int n = q.size();
            
            for(int i=0; i < n; i++){
                Node curr = q.poll();
                
                if(i == 0){
                    a.add(curr.data);
                }
                
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return a;
    }
}