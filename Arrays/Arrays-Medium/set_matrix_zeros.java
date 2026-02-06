//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

//You must do it in place.

class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            if(rows.contains(i)){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
            }
        }

        for(int i=0;i<matrix[0].length;i++){
            if(cols.contains(i)){
            for(int j=0;j<matrix.length;j++){
                matrix[j][i]=0;
            }
            }
        }

        
    }
}