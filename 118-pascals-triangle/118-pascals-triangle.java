class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][]res = new int[numRows][numRows];
        res[0][0] = 1;
        for(int i = 0; i < numRows; i++){
            for(int j =0; j < numRows; j++){
                int num = res[i][j];
                if(i+1 < numRows){
                    res[i+1][j] += num;
                    if(j+1 < numRows){
                        res[i+1][j+1] += num;
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0; i < numRows; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j <=i; j++){
                temp.add(res[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }
}