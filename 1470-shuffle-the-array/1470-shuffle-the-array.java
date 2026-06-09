class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[2 * n];
        
        // Changed i = i + 2 to i++ to visit every index sequentially
        for (int i = 0; i < n; i++) {
            a[2 * i] = nums[i];       // Places x1, x2, x3...
            a[2 * i + 1] = nums[n + i]; // Places y1, y2, y3...
        }
        
        return a;
    }
}