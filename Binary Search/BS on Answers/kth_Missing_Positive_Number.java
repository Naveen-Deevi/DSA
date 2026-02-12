//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

//Return the kth positive integer that is missing from this array.


class Solution {
    static int get(int[] arr, int mid){
        int count = 0;
        int i=0,j=1;
        while(i<arr.length&&j<=mid){
            if((j)!=arr[i]){
                count++;

            }
            else{
                i++;
            }
            j++;
        }
        count+=mid-j+1;
        return count;
    }
    public int findKthPositive(int[] arr, int k) {
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
        int n = arr.length;

        int l = k, r = arr[n-1]+k;
        while(l<=r){
            int mid = (l+r)/2;
            if(get(arr,mid)>=k){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;

    }
}