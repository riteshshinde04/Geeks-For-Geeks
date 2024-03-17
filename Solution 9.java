class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int candidate = a[0];
        int count = 1;
        for (int i = 1; i < size; i++) {
            if (a[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = a[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == candidate) {
                count++;
            }
        }
        if (count > size / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}