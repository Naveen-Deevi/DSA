//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.


class Solution {

        static long getHrs(int mid,  int[] piles,int n){
        long total_hrs = 0;
        for(int i=0;i<n;i++){
            total_hrs += Math.ceilDiv(piles[i],mid);
        }
        return total_hrs;
    }

    
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            max = Math.max(max,piles[i]);
        }
        int l = 1, r = max;

        while(l<=r){
            int mid = (l+r)/2;
            if(getHrs(mid,piles,n)<=h){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}