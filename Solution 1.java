class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        int l = 0;
        int r = 0;
        int sum = 0;

        while (r < n || sum >= s) {
            if (sum == s) {
                ans.add(l + 1);
                ans.add(r);
                return ans;
            } else if (sum < s) {
                if (r < n) {
                    sum += arr[r];
                    r++;
                } else {
                    break;
                }
            } else {
                sum -= arr[l];
                l++;
            }
        }

        ans.add(-1);
        return ans;
    }
}
