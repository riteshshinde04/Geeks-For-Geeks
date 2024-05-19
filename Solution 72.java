class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        // code here
        int low = 0;
        int high = n - 1;
        int closest = arr[0];
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Update closest if current mid is closer or if it's equally close but greater
            if (Math.abs(arr[mid] - k) < Math.abs(closest - k) || 
               (Math.abs(arr[mid] - k) == Math.abs(closest - k) && arr[mid] > closest)) {
                closest = arr[mid];
            }
            
            if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                return arr[mid]; // Exact match found
            }
        }
        
        return closest;
    }
}
        
