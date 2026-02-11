// A conveyor belt has packages that must be shipped from one port to another within days days.

class Solution {
    static int ship(int[] weights,int mid){
        int days = 1, load = 0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                days++;
                load = weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,weights[i]);
            sum += weights[i];
        }

        int l =max , r = sum;

        while(l<=r){
            int mid = (l+r)/2;
            if(ship(weights,mid)<=days){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}