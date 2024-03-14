class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
    int sum1=0;
    
    for(int i=0;i<n-1;i++)
    {
        sum1=sum1+array[i];
    }
    
    int sum2=n*(n+1)/2;
    
    int diff=sum2-sum1;
    return diff;
    }
}