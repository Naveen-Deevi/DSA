//Given an integer array nums, find the subarray with the largest sum, and return its sum.

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_so_far=nums[0],current_max=nums[0];

        for(int i=1;i<n;i++){
            current_max=Math.max(nums[i],current_max+nums[i]);
            if(current_max>max_so_far){
                max_so_far=current_max;
            }
        }
        return max_so_far;
    }
}