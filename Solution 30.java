class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long pr = 1;
        long res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            pr *= arr[i];
            res = Math.max(res, pr);
            if (pr == 0) {
                pr = 1;
            }
        }

        pr = 1L;
        for (int i = n - 1; i >= 0; i--) {
            pr *= arr[i];
            res = Math.max(res, pr);
            if (pr == 0) {
                pr = 1;
            }
        }

        return res;
    }
}
