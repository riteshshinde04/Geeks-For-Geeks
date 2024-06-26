class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans = new int[2];
        int i;
        for (i = 0; i < n; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                ans[0] = abs_val;
        }
        for (i = 0; i < n; i++) {
            if (arr[i] > 0)
                ans[1] = i + 1;
        }
        return ans;
    }
}
