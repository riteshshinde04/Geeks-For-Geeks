class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n=arr.length,n1=arr[0].length,ind=9999999,ans=-1;
        for(int i=0;i<n;i++){
           for(int j=0;j<n1;j++){
               if(arr[i][j]==1){
                   if(j<ind){
                       ind=j;
                       ans=i;
                   }
                   break;
               }
           }
        }
        return ans;
    }
}