// Return the index if the target is found. If not, return the index where it would be if it were inserted in order.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int mid=0;
        while(l<=r){
            mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
        
    }
}