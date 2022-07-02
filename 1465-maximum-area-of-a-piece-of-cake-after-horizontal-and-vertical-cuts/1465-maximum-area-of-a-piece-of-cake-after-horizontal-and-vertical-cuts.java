class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxH = horizontalCuts[0], maxV = verticalCuts[0];
        for(int i = 1; i < horizontalCuts.length; i++){
            maxH = Math.max(maxH, horizontalCuts[i] - horizontalCuts[i-1]);
        }
         maxH = Math.max(maxH, h - horizontalCuts[horizontalCuts.length-1]);
        
         for(int i = 1; i < verticalCuts.length; i++){
            maxV = Math.max(maxV, verticalCuts[i] - verticalCuts[i-1]);
        }
         maxV = Math.max(maxV, w - verticalCuts[verticalCuts.length-1]);
        
        long mod = 1000000000 + 7;
        long res = ((maxH % mod) * (maxV % mod)) % mod;
        
        return (int)res;
    }
}
