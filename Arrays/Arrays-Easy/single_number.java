// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

class Solution {
    public int singleNumber(int[] nums) {
        int n = 1;
        for(int i=0;i<nums.length;i++){
            n=n^nums[i];
        }
        return n;
    }
}