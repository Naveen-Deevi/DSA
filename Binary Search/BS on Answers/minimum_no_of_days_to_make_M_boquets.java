// You are given an integer array bloomDay, an integer m and an integer k.
//You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.


class Solution {
    static int getConcec(int[] bloomDay,int mid, int k){
        int len = 0;
        int ans = 0;
        for(int i=0;i<bloomDay.length;i++){
            
            if(bloomDay[i]<=mid){
                len++;
                if(len==k){
                ans++;
                len=0;
            }
            }
            else{
                len=0;
            }
        }
        return ans;
    }
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        if((long)m*k>n) return -1;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            max = Math.max(max,bloomDay[i]);
        }

        int l = 1, r=max;

        while(l<=r){
            int mid = (l+r)/2;
            if(getConcec(bloomDay,mid,k)>=m){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}