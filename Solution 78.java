class Solution {
    long max_Books(int arr[], int n, int k) {
        // Your code here
        long count = 0;
        long max = Long.MIN_VALUE;
        for(int i : arr){
            if(i <= k)count+=i;
            else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        return Math.max(max,count);
    }
}