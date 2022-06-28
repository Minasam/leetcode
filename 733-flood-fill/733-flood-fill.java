class Solution {
    public void dfs(int image[][],boolean visited[][], int i, int j, int srcC, int color){
        if(i < 0 || i == image.length || j < 0 || j == image[0].length){
            return;
        }
        if(visited[i][j]){
            return;
        }
        if(image[i][j] != srcC){
            return;
        }
        visited[i][j] = true;
        image[i][j] = color;
        dfs(image, visited, i+1, j, srcC, color);
        dfs(image, visited, i-1, j, srcC, color);
        dfs(image, visited, i, j+1, srcC, color);
        dfs(image, visited, i, j-1, srcC, color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        dfs(image, visited, sr, sc, image[sr][sc], color);
            
            
            return image;
    }
}