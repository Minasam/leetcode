class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums1){
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }else{
                map.put(x, 1);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int x : nums2){
            if(map.containsKey(x) && map.get(x) > 0){
                res.add(x);
                map.put(x, map.get(x)-1);
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < ans.length;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}