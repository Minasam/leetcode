class Solution {
    int height, width, moves;
    long [][][] dp;
    public long path(int move, int i, int j){
        if(move > moves){
            return 0;
        }
        //System.out.println(i+" "+j+" "+move);
        if(i == 0 || j == 0 || i == height-1 || j == width -1){
            return 1;
        }
        
        if(dp[i][j][move] != -1){
            return dp[i][j][move];
        }
        long res =0;
        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, 1, -1};
        
        for(int k = 0; k < 4; k++){
            res = (res + path(move+1, i+x[k], j+y[k] ))% 1000000007;
        }
        
        return dp[i][j][move] = res;
        
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        height = m+2;
        width = n+2;
        moves = maxMove;
        dp = new long[height][width][moves+1];
        for(int i=0; i < height; i++){
            for(int j = 0; j < width; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return (int) path(0, startRow+1, startColumn +1);
    }
}