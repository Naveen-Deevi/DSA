// Given an integer array nums, find a subarray that has the largest product, and return the product.

class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0],max = nums[0],global_max=nums[0];

        for(int i=1;i<nums.length;i++){
            int temp = Math.min(nums[i],Math.min(nums[i]*min,nums[i]*max));
            max = Math.max(nums[i],Math.max(nums[i]*min,nums[i]*max));
            min=temp;

            global_max=Math.max(global_max,max);
        }
        return global_max;
    }
}