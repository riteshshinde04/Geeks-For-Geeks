class Solution {
    // Function to find the vertical width of a Binary Tree.
    public int verticalWidth(Node root) {
        // code here.
        if(root==null) return 0;
        TreeMap<Integer,Node> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Node temp = q.peek().node;
            int l = q.peek().level;
            q.poll();
            map.put(l,temp);
            if(temp.left!=null){
                q.add(new Pair(l-1,temp.left));
            }
            if(temp.right!=null){
                q.add(new Pair(l+1,temp.right));
            }
        }
        if(map.size()>0) 
        return map.size();
        return 0;
    }
}
class Pair{
    int level;
    Node node;
    public Pair(int level,Node node){
        this.level = level;
        this.node = node;
    }
}