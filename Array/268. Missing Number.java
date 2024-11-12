class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int naturalSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return naturalSum - actualSum;
    }
}
