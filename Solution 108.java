class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        // If q is greater than 2*n, it is an invalid value since the maximum value in the matrix is 2*n
        if (q > 2 * n) {
            return 0;
        }
        
        // Determine the number of cells with the value q
        long count = 0;
        if (q <= n) {
            // For q <= n, the values from the 1st row to the q-1th row in the first column to the q-1th column are valid
            count = q - 1;
        } else {
            // For q > n, the values from the q-nth row to the nth row in the nth column to the 2n-q+1th column are valid
            count = 2 * n - q + 1;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(sumMatrix(4, 7)); 
        System.out.println(sumMatrix(5, 4)); 
    }
}