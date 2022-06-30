class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int count = mat.length * mat[0].length;
        if(count != r * c ){
            return mat;
        }
        int[][]res = new int[r][c];
        for(int i = 0; i < mat.length; i ++){
            for(int j = 0; j < mat[0].length; j++){
                int index = i * mat[0].length + j;
                int x = index / c;
                int y = index % c;
                System.out.println(x);
                System.out.println(y);
                res[x][y] = mat[i][j];
            }
        }
        return res;
    }
}