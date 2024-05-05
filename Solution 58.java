class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        TreeMap<Integer,Integer> map=new TreeMap<>();
        helper(root,map,0);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int key : map.keySet()){
            ans.add(map.get(key));
        }
        Collections.reverse(ans);
        return ans;
    }
    public void helper(Node root,TreeMap<Integer,Integer> map,int curr){
        if(root==null) return;
        map.put(curr,map.getOrDefault(curr,0)+root.data);
        helper(root.left,map,curr+1);
        helper(root.right,map,curr-1);
    }
}