/*Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        int p1=0,p2=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[p1]=nums[i];
                p1+=2;
            }
            else{
                arr[p2]=nums[i];
                p2+=2;
            }
        }
        return arr;
    }
}