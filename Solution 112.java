class Solution {
    public String pattern(int[][] arr) {
        // Code here
        boolean palindromeFound = false;
        int index = -1;
        
        for (int i = 0; i < arr.length; i++){
            int j = 0;
            while (j < arr.length / 2){
                if (arr[i][j] != arr[i][arr.length - 1 - j]){
                    break;
                }
                j++;
            }
            if (j == arr.length / 2){
                palindromeFound = true;
                index = i;
                break;
            }
        }
        
        if (palindromeFound){
            return index + " R";
        }
        
        for (int j = 0; j < arr.length; j++){
            int i = 0;
            while (i < arr.length / 2){
                if (arr[i][j] != arr[arr.length - 1 - i][j]){
                    break;
                }
                i++;
            }
            if (i == arr.length / 2){
                palindromeFound = true;
                index = j;
                break;
            }
        }
        
        if (palindromeFound){
            return index + " C";
        } else {
            return "-1";
        }
    }
}
