class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
        if (n < 3) {
            return 1;
        }
        
        int p0 =1, p1 = 1, p2 = 1;
        int MOD = 1000000007;
        
        for (int i = 3; i <= n; i++) {
            int temp = (p1 + p0) % MOD;
            p0 = p1;
            p1 = p2;
            p2 = temp;
        }
        
        return p2;
    }
    
}