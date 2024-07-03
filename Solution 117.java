class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node curr1 = curr.next;
            boolean isDup = false;
            while(curr1!=null && curr1.data == curr.data) {
                isDup = true;
                curr1 = curr1.next;
            }
            
            if(prev==null && isDup){
                head = curr1;
                prev = null;
            }
            
            else if(isDup){
                prev.next = curr1;
            }
            else{
                prev = curr;
            }
            
            curr = curr1;
        }
        return head;
    }
}