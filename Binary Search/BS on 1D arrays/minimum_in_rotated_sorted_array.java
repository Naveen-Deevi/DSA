// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

class Solution {
    public int findMin(int[] nums) {
        int l =0,r=nums.length-1,min = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[l]<=nums[mid]){
                min = Math.min(min,nums[l]);
                l = mid+1;
            }
            else if(nums[mid]<=nums[r]){
                min = Math.min(min,nums[mid]);
                r = mid-1;
            }
        }
        return min;
    }
}