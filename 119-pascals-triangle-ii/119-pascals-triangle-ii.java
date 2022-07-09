class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int up = rowIndex;
        int down = 1;
        long temp = 1;
        res.add((int)temp);
        for(int i =0; i < rowIndex; i++){
            temp = temp * up / down;
            up --;
            down++;
            res.add((int)temp);
        }
        return res;
    }
}