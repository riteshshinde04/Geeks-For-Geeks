class Solution {
    public static int longestSubseq(int n, int[] a) {
        // return BottomUpMemo(0,-1,n,a,new Integer[n+1][n]);
        // return tab(n,a);
        // return spaceOptimizationTab(n,a);
        return oneArray(n,a);
    }
    
    static int oneArray(int n,int a[]){
        
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        
        
        for(int i=0;i<n;i++){
            for(int p=0;p<i;p++){
                
                if(a[i]==a[p]+1 || a[p]==a[i]+1){
                    dp[i] = Math.max(dp[i], dp[p] + 1);
                }
                
            }
        }
        
        
        int max=0;
        for(int i:dp)   max = Math.max(max,i);
        
        return max;
        
        
    }
    
    static int spaceOptimizationTab(int n,int a[]){
        
        
        int next[] = new int[n+1], cur[] = new int[n+1];
        
        for(int i=n-1;i>=0;i--){
            for(int p=i;p>=-1;p--){
                
                
                int take=0, notTake=0;
        
                if(p==-1 || a[p]+1==a[i] || a[p]==a[i]+1)   take = next[i+1] + 1;
                
                notTake = next[p+1];
                
                cur[p+1] = Math.max(take,notTake);
                
            }
            
            next = cur;
            cur = new int[n+1];
        }
        
        
        return next[0];
        
    }
    
    static int tab(int n,int a[]){
        
        int dp[][] = new int[n+1][n+1];
        
        for(int i=n-1;i>=0;i--){
            for(int p=i;p>=-1;p--){
                
                
                int take=0, notTake=0;
        
                if(p==-1 || a[p]+1==a[i] || a[p]==a[i]+1)   take = dp[i+1][i+1] + 1;
                
                notTake = dp[i+1][p+1];
                
                dp[i][p+1] = Math.max(take,notTake);
                
            }
        }
        
        return dp[0][0];
    }
    
    static int BottomUpMemo(int i,int p,int n,int a[],Integer dp[][]){
        if(i==n)    return 0;
        
        if(dp[i][p+1]!=null)    return dp[i][p+1];
        
        int take=0, notTake=0;
        
        if(p==-1 || a[p]+1==a[i] || a[p]==a[i]+1)   take = BottomUpMemo(i+1,i,n,a,dp) + 1;
        
        notTake = BottomUpMemo(i+1,p,n,a,dp);
        
        return dp[i][p+1] = Math.max(take,notTake);
    }
}