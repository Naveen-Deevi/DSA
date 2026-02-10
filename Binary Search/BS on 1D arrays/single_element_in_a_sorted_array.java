//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

//Return the single element that appears only once.

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1, r = n-2;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        else if(nums[n-1]!=nums[n-2]) return nums[n-1];
 
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }

            else if((mid%2==1&&nums[mid]==nums[mid-1])||(mid%2==0)&&nums[mid]==nums[mid+1]){
                l = mid+1;
            }

            else{
                r = mid-1;
            }
        }
        return -1;
    }
}