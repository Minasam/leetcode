class Solution {
    public String getHint(String secret, String guess) {
        int [] sCount = new int[10];
        int [] gCount = new int[10];
        int exact = 0, count = 0;
        for(int i =0; i < secret.length(); i++){
            int s = secret.charAt(i);
            int g = guess.charAt(i);
            if(s == g){
                exact++;
            }else{
                sCount[s-'0']++;
                gCount[g-'0']++;
            }
        }
        for(int i=0; i < 10; i++){
            count += Math.min(gCount[i], sCount[i]);
        }
        return exact+"A"+count+"B";
    }
}