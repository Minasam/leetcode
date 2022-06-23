class Solution {
    public int longestPalindrome(String s) {
        int length = s.length();
        int[] count = new int[256];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)]++;
        }
        int longest = 0;
        for(int x : count){
            longest += (x - (x%2));
        }
        if(length > longest){
            longest++;
        }
        
        return longest;
    }
}