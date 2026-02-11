/*Given an array of integers nums and an integer threshold,
we will choose a positive integer divisor,
 divide all the array by it, and sum the division's result.
  Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
 */

class Solution {
    static int sum(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += Math.ceilDiv(nums[i],mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
        }
        int l=1,r=max;
        while(l<=r){
            int mid = (l+r)/2;
            if(sum(nums,mid)<=threshold){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}