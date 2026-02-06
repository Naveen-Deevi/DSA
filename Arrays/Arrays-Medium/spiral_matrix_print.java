//Given an m x n matrix, return all elements of the matrix in spiral order.

//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int k=0,i=0,j=0;
        int count = rows*cols;
        while(count>0){
            ans.add(matrix[i][j]);
            visited[i][j]=true;
            int n1 = i+ dir[k][0];
            int n2 = j+ dir[k][1];
            if(n1<0||n1>=rows||n2<0||n2>=cols||visited[n1][n2]){
                k=(k+1)%4;
                n1 = i+ dir[k][0];
                n2 = j+ dir[k][1];
            }
            i=n1;
            j=n2;

            
            count--;
        }
        return ans;
    }
}