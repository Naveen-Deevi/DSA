//Remove duplicates from a sorted array

class Solution {
    public int removeDuplicates(int[] nums) {
        int j =1;
        int z=nums[0];
        int k =1;
        for(int i =1; i<nums.length; i++){
            if(nums[i] != z){
                nums[j++] = nums[i];
                k++;
            }
            z = nums[i];
        }
        return k;
    }
}