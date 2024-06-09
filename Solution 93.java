class Solution {
    public static void zigZag(int n, int[] arr) {
        // code here
        for(int i=0;i<n-1;i++){
            if(i%2==0 &&arr[i]>arr[i+1])swap(arr,i,i+1);
            if(i%2==1 && arr[i]<arr[i+1])swap(arr,i,i+1);
        }
    }
      public static  void swap(int array[], int a, int b){
        int temp=array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
