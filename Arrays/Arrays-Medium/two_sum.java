//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        int[] arr = new int[2];

        for(int i=0;i<n;i++){
            int comp = target-nums[i];
            if(hm.containsKey(comp)){
                arr[0]=i;
                arr[1]=hm.get(comp);
                return arr;
            }
            hm.put(nums[i],i);
        }
        return arr;
    }
}