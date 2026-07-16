class Solution {
    public static void dfs(char[][] grid,int row,int col){
        int r=grid.length;
        int c=grid[0].length;
        if(row<0 || col<0 || row>=r || col>=c || grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid,row-1,col);
        dfs(grid,row+1,col);
        dfs(grid,row,col-1);
        dfs(grid,row,col+1);
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;   
    }
}