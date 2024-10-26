class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


//TLE

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;

        for(int j = 0; j < k; j++){
            int lastelement = nums[length-1];

            for(int i = length - 1; i > 0; i--){
                nums[i] = nums[i-1];
            }

            nums[0] = lastelement;
        }
    }
}
