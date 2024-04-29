class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head.next==null){
           return null;
       }


       Node slow=head;
       Node fast=head;


       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }


       fast=head;                               //again save fast to the starting position .
       
       while(fast.next!=slow){             //move fast to previous of mid;
           fast=fast.next;
       }
       
       
       fast.next=fast.next.next;           // point previous of mid to next of mid;
       return head;
    }
}