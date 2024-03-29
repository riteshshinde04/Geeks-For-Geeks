class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            // max priority Queue
        int n = arr.length;
        
        for(int i = 0;i<k;i++) {
            pq.add(arr[i]);
        }
        
        for(int i = k;i<n;i++) {
            int x = pq.poll();
            if(arr[i]<x) {
                pq.add(arr[i]);
            } else {
                pq.add(x);
            }
        }
        return pq.peek();
    } 
}