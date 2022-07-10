class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i =0; i < nums.length; i++){
            if(i > 0)
                nums[i] = nums[i-1] + nums[i];
             int diff =  nums[i] - k;
            if(map.containsKey(diff)){
                count += map.get(diff);
            }
            if(nums[i] == k){
                count++;
            }
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
           
        }
                        return count;
    }
}