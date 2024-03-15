class Solution
{
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void sort012(int a[], int n)
    {
        int left=0;
        int mid = 0;
        int right = n-1;
        
        while(mid<=right) {
            if(a[mid] == 0) {
                swap(a, mid, left);
                left++;
                mid++;
            } else if(a[mid] == 1) {
                mid++;
            } else if(a[mid] == 2) {
                swap(a, mid, right);
                right--;
            }
        }
    }
}