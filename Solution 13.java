class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array
    static long ans;
    static void merge(long arr[], int l, int m, int r) {
        
        long[] c = new long[r-l+1];
        
        int i = l, j = m+1;
        int k = 0;
        while(i<=m && j<=r) {
            if(arr[i]>arr[j]) {
                ans += m - i + 1;
                c[k++] = arr[j++];
            } else {
                c[k++] = arr[i++];
            }
        }
        while(i<=m) {
            c[k++] = arr[i++];
        }
        while(j<=r) {
            c[k++] = arr[j++];
        }
        
        int t = 0;
        for(int t1 = l;t1<=r; t1++){
            arr[t1] = c[t++];
        }
        
    }
    static void mergeSort(long arr[], int l, int r){
        if(l == r) {
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    
    static long inversionCount(long arr[], long N)
    {
        // Your Code 
        ans = 0;
        mergeSort(arr, 0, (int)(N-1));
        // {
        //     System.out.print(x);
        // }for(long x : arr) 
        return ans;
    }
}