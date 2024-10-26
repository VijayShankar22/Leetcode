class Solution {
    public int maxSum(int[] nums) {
        int maxsum = -1;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){

                int largestdigit1 = findlargestdigit(nums[i]);
                int largestdigit2 = findlargestdigit(nums[j]);

                if(largestdigit1 == largestdigit2){
                    int currentsum = nums[i] + nums[j];

                    if(currentsum > maxsum){
                        maxsum = currentsum;
                    }
                }
            }
        }
        return maxsum;
    }

    private int findlargestdigit(int num){
        int largestdigit = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit > largestdigit){
                largestdigit = digit;
            }
            num /= 10;
        }
        return largestdigit;
    }
}
