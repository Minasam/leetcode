class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        int [] res = new int[2];
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(map.containsKey(diff)){
                res[0] = i;
                res[1] = map.get(diff);
                break;
            }
            map.put(num, i);
        }
        return res;
    }
}