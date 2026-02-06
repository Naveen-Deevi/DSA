// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int c1=0,c2=0,count1=0,count2=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            
            if(nums[i]==c1){
                count1++;
            }
            else if(nums[i]==c2){
                count2++;
            }
            else if(count1==0){
                c1=nums[i];
                count1++;
            }
            else if(count2==0){
                c2=nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==c1){
                count1++;
            }
            if(nums[i]==c2){
                count2++;
            }
        }
        if(count1>n/3) ls.add(c1);
    
        if(count2>n/3) if(c1!=c2) ls.add(c2);
        return ls;
    }
}