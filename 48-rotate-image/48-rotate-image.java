class Solution {
    
    public void rotate(int[][] matrix) {
        for(int i =0 ;i < matrix.length; i++)    {
            for(int j = 0; j < matrix.length/ 2; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[matrix.length - j- 1][i];
                matrix[matrix.length - j-1][i] = temp;
            }
        }
        
      
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}