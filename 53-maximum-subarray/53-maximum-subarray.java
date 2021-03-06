class Solution {
    public int maxSubArray(int[] nums) {
        int[] sum = new int [nums.length];
        sum[0] = nums[0];
        for(int i =1; i < nums.length; i++){
            sum[i] = sum[i-1]+ nums[i];
        }
        int min = sum[0];
        int res = sum[0];
        for(int i = 1; i < sum.length; i++){
            int temp = sum[i] - min;
            res = Math.max(Math.max(temp, sum[i]), res);
            min = Math.min(min, sum[i]);
        }
        return res;
    }
}