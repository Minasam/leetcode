class Solution {
    public boolean checkRow(char[][] board, int r){
        boolean[] found = new boolean[10];
        for(int i = 0;i < board[0].length; i++){
            char c = board[r][i];
            if(c == '.'){
                continue;
            }
            if(found[c-'0']){
                return false;
            }
            found[c-'0'] = true;
        }
        return true;
    }
    
    public boolean checkCol(char[][]board, int col){
     boolean[] found = new boolean[10];
        for(int i = 0; i <board.length; i++){
            char c = board[i][col];
            if(c == '.'){
                continue;
            }
            if(found[c-'0']){
                return false;
            }
            found[c-'0'] = true;
        }
        return true;
    }
    
    public boolean checkSquare(char[][]board, int square){
        int r = (square / 3) * 3;
        int col = (square % 3 ) * 3;
        boolean[] found = new boolean[10];
        for(int i = r; i < r+3; i++){
            for(int j = col; j < col+3; j++){
                char c = board[i][j];
            if(c == '.'){
                continue;
            }
            if(found[c-'0']){
                return false;
            }
            found[c-'0'] = true;
            }
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i < 9; i++){
            System.out.println(i);
            if(!checkRow(board, i) || !checkCol(board, i) || !checkSquare(board, i)){
                return false;
            }
        }
        return true;
    }
}