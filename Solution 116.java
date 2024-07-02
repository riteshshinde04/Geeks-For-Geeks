class Solution {
    public boolean compute(Node root) {
        Node temp=root;
        StringBuilder res=new StringBuilder();
        while(temp!=null)
        {
            res.append(temp.data);
            temp=temp.next;
        }
        StringBuilder rev=new StringBuilder(res).reverse();
        if((rev.toString()).equals(res.toString()))
        {
            return true;
        }
        else{
            return false;
        }
    }
}