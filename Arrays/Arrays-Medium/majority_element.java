//Given an array nums of size n, return the majority element.

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int c=0,e=0;
        for(int i=0;i<n;i++){
            if(c==0){
                e=nums[i];
                c++;
            }
            else if(e==nums[i]){
                c++;
            }
            else{
                c--;
            }
        }
        return e;   
    }
}