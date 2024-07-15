class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        if ((d * 9) < s) {
            return "-1";
        }
        
        String ans = "";
        for (int i = d; i > 0; i--) {
            if (s > 9) {
                ans = "9" + ans;
                s = s - 9;
            } else {
                if (i == 1) {
                    ans = s + ans;
                } else {
                    ans = (s -  1) + ans;
                    i--;
                    while (i > 1) {
                        ans = "0" + ans;
                        i--;
                    }
                    ans = "1" + ans;
                    break;
                }
            }
        } 
        
        return ans;
    }
}