class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int bp= BreakPoint(arr);
        int a= BinarySearch(key,arr,0,bp);
        int b= BinarySearch(key,arr,bp,arr.length-1);
        if(a !=-1) return a;
        if(b!= -1 ) return b;
        return -1;
    }
    
    private int BreakPoint(int [] arr){
         int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    
    private int BinarySearch(int key, int [] arr, int s, int e){
        while(s<=e){
            int m = (s+e)/2;
            if(key==arr[m]) return m;
            else if(arr[m]<key) s=m+1;
            else e=m-1;
        }
        return -1;
    }
}