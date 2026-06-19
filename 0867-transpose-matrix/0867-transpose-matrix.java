class Solution {
    public int[][] transpose(int[][] matrix) {
        int trans_rows=matrix[0].length;
        int trans_cols=matrix.length;
        int trans_matrix[][]=new int[trans_rows][trans_cols];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                trans_matrix[j][i]=matrix[i][j];
            }
        }
        return trans_matrix;
        
    }
}