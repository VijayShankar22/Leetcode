class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1;
        int start = 0;
        int end = 0;
        int result = 0;

        while(end < nums.length){
            product *= nums[end];
            while(product >= k && start <= end){
                product /= nums[start];
                start++;
            }

            result = result+(end-start+1);
            end++;
        }  

        return result;
    }
}
