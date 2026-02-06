// Find the starting and ending position of a given target value.

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int i,j;
        int[] arr = {-1,-1};
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l>=nums.length||nums[l]!=target) return arr;
        r=nums.length-1;
        arr[0]=l;

        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<=target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        arr[1]=r;
        return arr;
        

    }
}