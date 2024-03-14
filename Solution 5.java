class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int max = -1;
        
        for(int i = n-1; i >=0 ;i--) {
            if(arr[i] >= max) {
                max = arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
    
         return result;
    }
    
}