class Solution
{
    public long PowMod(long x, long n, long m)
    {
        // Code here
         long res = 1;
        while(n > 0){
            if(n%2 == 1)res = (res * x)%m;
            x = (x * x)%m;
            n /= 2;
        }
        return res;
    }
}