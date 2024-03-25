class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow = head;
        Node fast = head;
        boolean isLoopFound = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                isLoopFound = true;
                break;
            }
        }
        
        if (isLoopFound) {
            slow = head;
            
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                
                fast.next = null;
            } else {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
            
        }
    }
}