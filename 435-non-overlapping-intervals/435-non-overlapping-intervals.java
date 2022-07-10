class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[]b){
                return a[1] - b[1];
            }
        });
        int count = 0;
        int start = -1000000, end = -1000000;
        for(int[] x: intervals){
            int a = x[0];
            int b = x[1];
            if(a < end){
                count++;
            }else{
                start = a;
                end = b;
            }
           
        }
        return count;
    }
}