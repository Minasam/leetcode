class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int x : nums){
            if(set.contains(x)){
                set.remove(x);
            }else{
                set.add(x);
            }
        }
        for(int x : set){
            return x;
        }
        return 0;
    }
}