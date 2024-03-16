class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sr = 0;
        int sl = 0;
        if(n == 1) return 1;
        
        for(int i =1;i<n;i++) { sr += arr[i]; }
        
        for(int i = 0;i<n-1;i++) {
            
            if(sl == sr) {
                return i+1;
            }
            
            sl += arr[i];
            sr -= arr[i+1];
        }
        return -1;
    }
}
