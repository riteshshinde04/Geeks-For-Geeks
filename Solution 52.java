class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	// Your code here
	if(k==1)
        return null;
        int i = 2;
        Node temp = head;
	    while(head!=null && head.next != null)
	    {
	        if(i%k == 0)
	        {
	            head.next = head.next.next;
	            i+=2;
	        }
	        else
	        i++;
	            head = head.next;
	    }
	    return temp;
    }
}