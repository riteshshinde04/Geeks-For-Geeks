class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[cnt];
                arr[cnt]=temp;
           cnt++;
            }
        }
    }
}
