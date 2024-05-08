class Solution {
    public static void find(Node root,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){
        if(root == null)return;
        list.add(root.data);
        if(root.left == null && root.right == null){
            ans.add(new ArrayList<>(list));
        }
        else{
            find(root.left,list,ans);
            find(root.right,list,ans);
        }
        list.remove(list.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        find(root,list,ans);
        return ans;
    }
}