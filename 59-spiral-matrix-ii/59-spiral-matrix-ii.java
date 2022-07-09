class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int dir = 0;
        int i = 0, j=0;
        while(num <= n * n ){
            matrix[i][j] = num++;
            if(dir == 0){
                if(j == n-1 || matrix[i][j+1] !=0){
                    dir = 1;
                    i++;
                }else{
                    j++;
                }
            }else if(dir == 1 ){
                if(i == n-1 || matrix[i+1][j] != 0){
                    dir = 2;
                    j--;
                }else{
                    i++;
                }
            }else if(dir == 2 ){
                if(j == 0 || matrix[i][j-1]!=0){
                    dir = 3;
                    i--;
                }else{
                    j--;
                }
            }else if(dir == 3 ){
                if(i == 0 || matrix[i-1][j] != 0){
                    dir = 0;
                    j++;
                }else{
                    i--;
                }
            }
        }
        return matrix;
    }
}