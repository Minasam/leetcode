class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;
        
        for(int x : nums){
            if(count == 0 ){
                result = x;
            }
            
            count += result == x ? 1:-1;
        }
        
        return result;
    }
}