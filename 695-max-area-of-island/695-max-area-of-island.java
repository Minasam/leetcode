class Solution {
    boolean[][] visited;
    public int dfs(int[][]grid, int i, int j){
        if(i < 0 || j < 0 || i == grid.length ||j == grid[0].length){
            return 0;
        }
        if(visited[i][j] || grid[i][j] == 0){
            return 0;
        }
        visited[i][j] = true;
        int result = 1 + dfs(grid, i+1, j) + dfs(grid, i-1, j)+ dfs(grid, i, j+1)+dfs(grid, i, j-1);
        return result;
    }
    public int maxAreaOfIsland(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        int res = 0;
        for(int i =0;i < grid.length; i++){
            for(int j =0; j < grid[0].length; j++){
                if(!visited[i][j]){
                    res = Math.max(res, dfs(grid, i, j));
                }
            }
        }
        return res;
    }
}