class Solution {
    // Function to construct binary tree from parent array.
    public Node createTree(int parent[]) {
        // Your code here
         int n=parent.length;
        HashMap<Integer,Node> map=new HashMap<>();
        for(int i=0;i<n;i++){
            Node newNode=new Node(i);
            map.put(i,newNode);
        }
        Node head=null;
        for(int i=0;i<n;i++){
            if(parent[i]==-1){
                head=map.get(i);
                continue;
            }
            Node root=map.get(parent[i]);
            if(root.left==null){
                root.left=map.get(i);
            }else{
                root.right=map.get(i);
            }
        }
        return head;
    }
}
