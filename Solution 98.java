class Solution {
    static String armstrongNumber(int n){
        // code here
         int rem,sum=0,temp=n;
        while(n!=0){
            rem=n%10;
            sum+=Math.pow(rem,3);
            n=n/10;
        }
        if(temp==sum){
            return "Yes";
        }else{
            return "No";
        }
    }
}