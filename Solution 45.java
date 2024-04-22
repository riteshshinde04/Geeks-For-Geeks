class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int ans = Integer.MAX_VALUE;
        int idx = -1;
        for(int i = 0; i < n ; i++){
            int count = 0;
            for(int j = 0; j < m ; j++){
                if(a[i][j] == 1){
                    count++;
                }
            }
            if(count < ans){
                ans = count;
                idx = i;
            }
        }
        return idx+1;
    }
};