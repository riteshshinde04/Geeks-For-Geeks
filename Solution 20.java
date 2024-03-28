class Solution {
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int lmx = arr[0];
        int rmx = arr[n-1];
        
        for(int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i], lmx);
            lmx = Math.max(arr[i], lmx);
        }
        
        for(int i = n-2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmx);
            rmx = Math.max(arr[i], rmx);
        }
        
        long ans = 0;
        for(int i = 0; i < n; i++) {
            int htOfwater = Math.min(lmax[i], rmax[i]) - arr[i];
            if(htOfwater > 0) {
                ans += htOfwater;
            }
        }
        return ans;
    } 
}