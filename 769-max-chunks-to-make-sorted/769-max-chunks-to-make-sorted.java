class Solution {
    public boolean check(int[] arr, int start,int end){
        boolean[] found = new boolean[arr.length];
        for(int i = start; i <= end; i++){
            found[arr[i]] = true;
        }
        for(int i = start; i <= end; i++){
            if(!found[i]){
                return false;
            }
        }
        return true;
    }
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int start = 0;
        for(int i = 0; i < arr.length; i++){
            if(check(arr, start, i)){
                chunks++;
                start = i+1;
            }
        }
        return chunks;
    }
}