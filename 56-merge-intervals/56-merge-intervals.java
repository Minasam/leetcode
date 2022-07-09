class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new java.util.Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
});
        List<List<Integer>> res = new LinkedList<>();
        int start = -1, end = -1;
        for(int i = 0; i < intervals.length; i++){
            if(intervals[i][0] > end){
                res.add(Arrays.asList(start, end));
                start = intervals[i][0];
                end = intervals[i][1];
            }else{
                end = Math.max(end, intervals[i][1]);
            }
        }
        res.add(Arrays.asList(start, end));
        int[][] result = new int[res.size()-1][2];
        for(int i = 1; i < res.size(); i++){
            result[i-1][0] = res.get(i).get(0);
            result[i-1][1] = res.get(i).get(1);
        }
        return result;
    }
}