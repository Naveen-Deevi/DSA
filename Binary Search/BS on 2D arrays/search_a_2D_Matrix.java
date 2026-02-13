//You are given an m x n integer matrix matrix with the following two properties:

//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.



class Solution {
    static int[] index(int r, int c, int mid){
        int[] arr = {mid/c,mid%c};
        return arr;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length, c = matrix[0].length;
        int low = 0, high = r*c-1;

        while(low<=high){
            int mid = (low+high)/2;
            int[] arr = index(r,c,mid);
            if(matrix[arr[0]][arr[1]]==target){
                return true;
            }
            else if(matrix[arr[0]][arr[1]]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}