class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] <= target && matrix[i][matrix[0].length-1] >= target){
                row = i;
                break;
            }
        }
        if(row == -1){
            return false;
        }
        for(int i=0; i < matrix[0].length; i++){
            if(matrix[row][i] == target){
                return true;
            }
        }
        
        return false;
        
    }
}