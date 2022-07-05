class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            int num = nums[i];
            if(i > 0 && nums[i-1] == num){
                continue;
            }
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi ){
                int sum = num + nums[lo] + nums[hi];
                int remain = 0 - num;
                if(sum == 0){
                    res.add(Arrays.asList(num, nums[lo], nums[hi]));
                    while(lo < hi &&nums[lo] == nums[lo+1]){
                        lo++;
                    }
                    while(lo < hi && nums[hi] == nums[hi-1]){
                        hi--;
                    }
                    lo++;
                    hi--;
                }else if(nums[lo]+nums[hi] < remain){
                    lo++;
                }else{
                    hi--;
                }
            }
        }
        return res;
    }
}