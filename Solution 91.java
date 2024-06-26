class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int size = Arrays.stream(r).max().getAsInt();
        int []arr = new int[size+2];
        for(int i=0;i<n;i++){
            arr[l[i]]++;
            arr[r[i]+1]--;
        }
        for(int i=1;i<size+2;i++){
            arr[i]+=arr[i-1];
        }

        int maxi = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<size+2;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
                index =i;
            }
        }
        return index;
    }
}