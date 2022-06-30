class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count1 = new int[1001];
        int[] count2 = new int[1001];
        for(int x : nums1){
            count1[x] ++;
        }
        for(int x : nums2){
            count2[x] ++;
        }
        ArrayList<Integer> res= new ArrayList<Integer>();
        for(int i=0; i < count1.length; i++){
            int inter = Math.min(count1[i], count2[i]);
            for(int j=0; j < inter; j++){
                res.add(i);
            }
        }
        int[] ans = new int[res.size()];
        for(int i =0; i < ans.length; i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}