//Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

//Return the minimized largest sum of the split.


class Solution {
    static int calc(int[] nums, int mid){
        int k = 1, sum = 0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else{
                k++;
                sum = nums[i];
            }
        }
        return k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int max=Integer.MIN_VALUE, sum = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            sum+=nums[i];
        }

        int l = max, r = sum;

        while(l<=r){
            int mid = (l+r)/2;
            if(calc(nums,mid)<=k){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
        

    }
}