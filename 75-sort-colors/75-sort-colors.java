class Solution {
    public void sortColors(int[] nums) {
        int p1 = 0, p2 = nums.length - 1;
        for(int i = 0; i <= p2; i++){
            if(nums[i] == 0 && i > p1){
                nums[i] = nums[p1];
                nums[p1++] = 0;
                i--;
            }else if(nums[i] == 2){
                nums[i] = nums[p2];
                nums[p2--] = 2;
                i--;
            }
        }
    }
}