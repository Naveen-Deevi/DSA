// Move all 0's to the end of it while maintaining the relative order

class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[start++]=nums[i];
            }
            else{
                count++;
            }
        }

        for(int i=n-count;i<n;i++){
            nums[i]=0;
        }
        
    }
}