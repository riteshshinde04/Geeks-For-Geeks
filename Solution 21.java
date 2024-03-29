class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int target = k - arr[i];
            if (map1.containsKey(target)) {
                count += map1.get(target);
            }
            map1.put(arr[i], map1.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
}
