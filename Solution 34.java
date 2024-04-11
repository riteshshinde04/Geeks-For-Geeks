class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        
        int i=0;
        int j=1;
        int res = 0;
        while(i<size){
            
            if(arr[i] !=j){
                res = arr[i];
            }else{
                j++;
            }
            i++;
            
            if(i==size){
                return j;
            }
        }
     
    return res;   
    }
}