class Solution {
    public boolean compare(int[] a, int[] b){
        for(int i= 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        if(p.length() > s.length()){
            return res;
        }
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for(int i=0; i < p.length(); i++){
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        
        if(compare(pCount, sCount)){
            res.add(0);
        }
        for(int i= 1; i < s.length() - p.length() + 1; i++){
            sCount[s.charAt(i-1)-'a']--;
            sCount[s.charAt(i+p.length()-1)-'a']++;
            if(compare(pCount, sCount)){
                res.add(i);
            }
        }
        return res;
    }
}