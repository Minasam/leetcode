class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] pascal = new int[rowIndex+1][rowIndex+1];
        pascal[0][0] = 1;
        for(int i = 0; i < pascal.length-1; i++){
            for(int j = 0; j < pascal.length; j++){
                pascal[i+1][j] += pascal[i][j];
                if(j < pascal.length -1){
                    pascal[i+1][j+1] += pascal[i][j];
                }
            }
        }
        List<Integer> res = new LinkedList<Integer>();
        for(int x : pascal[rowIndex]){
            res.add(x);
        }
        return res;
    }
}