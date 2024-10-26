class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int arraylength = nums.length;
        int uniquecount = 0;

        for(int i = 0; i < arraylength; i++){
            int j = i+1;

            while(j < arraylength && nums[i] == nums[j]){
                j++;
            }
            nums[uniquecount++] = nums[i];
            i = j-1;
        }

        return uniquecount;
    }
}
