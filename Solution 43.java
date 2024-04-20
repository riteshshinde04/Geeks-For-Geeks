class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i=0,j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
                while(i<n && arr1[i]==arr1[i-1])i++;
                while(j<m && arr2[j]==arr2[j-1])j++;
            }
            else if(arr1[i]<arr2[j]){
                ans.add(arr1[i]);
                i++;
                while(i<n && arr1[i]==arr1[i-1])i++;
            }
            else{
                ans.add(arr2[j]);
                j++;
                while(j<m && arr2[j]==arr2[j-1])j++;
            }
        }
        while(i<n){
            ans.add(arr1[i]);
            i++;
            while(i<n && arr1[i]==arr1[i-1])i++;
        }
        while(j<m){
            ans.add(arr2[j]);
            j++;
            while(j<m && arr2[j]==arr2[j-1])j++;
        }
        return ans;
    }
}