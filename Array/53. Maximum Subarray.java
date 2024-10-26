class Solution{
    public int maxSubArray(int[] nums){
        int maxsum = nums[0];
        int currentsum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(currentsum + nums[i] > nums[i]){
                currentsum = currentsum + nums[i];
            }else{
                currentsum = nums[i];
            }
            
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
        }
        return maxsum;
    }
}



//TLE

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum = sum+nums[j];
                if(sum > maxsum){
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }
}

