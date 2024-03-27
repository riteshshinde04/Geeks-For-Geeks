class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        if(head == null || head.next == null) return false;
        if(head.next == head) return true;
        Node slow = head;
        Node fast = head;
        if(slow.next == null) return false;
        while(slow.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(fast.next == null) return false;
            if(slow == fast) return true;
        }
        return false;
    }
}