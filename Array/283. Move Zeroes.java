class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int k = 0;
        for(int i = 0; i < length; i++){
            if(nums[i] != 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
    }
}
