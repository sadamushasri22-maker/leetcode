class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
          int n = nums.length;
        if (n == 0) return 0; 
        int currentStreak = (nums[0] == 1) ? 1 : 0;
        int maxStreak = currentStreak;
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] == 1) {
                if (nums[i] == 1) {
                    currentStreak++;
                } else {
                    currentStreak = 1;
                }
            } else {
                currentStreak = 0; 
            } 
            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
            }
        }
        
        return maxStreak;
        
    }
}