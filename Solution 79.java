class Solution 
{
    public int findMinCost(String str1, String str2, int costX, int costY) 
    {
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int arr[]:dp)
        {
            Arrays.fill(arr,-1);
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
         for(int j=0;j<=m;j++)
        {
            dp[0][j]=0;
        }
        for(int ind1=1;ind1<=n;ind1++)
        {
            for(int ind2=1;ind2<=m;ind2++)
            {
                 if(str1.charAt(ind1-1)==str2.charAt(ind2-1))
                 {
                   dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                 }
                 else dp[ind1][ind2]=Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);

            }
        }

       int lcs=dp[n][m];
       return (n-lcs)*costX+(m-lcs)*costY;
       }
}