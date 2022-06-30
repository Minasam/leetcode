class Solution {
    public int diff(int[] nums, int num){
        int result = 0;
        for(int x: nums){
            result += Math.abs(x-num);
        }
        return result;
    }
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        if(nums.length % 2 ==0){
            return Math.min(diff(nums, nums[nums.length/2]),diff(nums, nums[nums.length/2-1]));
        }else{
            return diff(nums, nums[nums.length/2]);
        }
        
    }
}