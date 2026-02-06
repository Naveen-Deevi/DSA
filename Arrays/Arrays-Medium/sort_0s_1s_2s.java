//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int k=0;
        for(int j=0;j<3;j++){
        for(int i =0;i<n;i++){
            if(nums[i]==j){
                int temp = nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
        }
        }
    }
}