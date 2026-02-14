//A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.

class Solution {
    static int findmax(int[][] mat, int mid){
        int max = Integer.MIN_VALUE, max_I=-1;
        for(int i=0;i<mat.length;i++){
            if(max<mat[i][mid]){
                max_I = i;
                max = mat[i][mid];
            }
        }
        return max_I;
    }
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int low = 0, high = cols-1;
        int[] ans = new int[2];
        while(low<=high){
            int mid=(low+high)/2;
            int col_max = findmax(mat,mid);

            int left = mid-1>=0 ? mat[col_max][mid-1] : -1;
            int right = mid+1>=cols ? -1 : mat[col_max][mid+1] ;

            if(left<mat[col_max][mid]&&mat[col_max][mid]>right){
                ans[0] = col_max;
                ans[1] = mid;
                return ans;
            }
            else if(left>mat[col_max][mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}