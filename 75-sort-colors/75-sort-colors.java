class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int x : nums){
            count[x]++;
        }
        int index = 0;
        for(int i = 0;i < nums.length; i++){
            while(count[index] == 0){
                index ++;
            }
            nums[i] = index;
            count[index] --;
        }
    }
}