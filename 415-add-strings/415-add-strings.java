class Solution {
    public String addStrings(String num1, String num2) {
        int remaining = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Math.max(num1.length(), num2.length()); i++){
            int a = i  < num1.length() ? num1.charAt(num1.length()-i-1) - '0': 0;
            int b = i  < num2.length() ? num2.charAt(num2.length()-i-1) - '0': 0;
            int sum = a + b + remaining;
            sb.append(sum%10);
            remaining = sum / 10;
        }
        if(remaining > 0){
           sb.append(remaining);
        }
        return sb.reverse().toString();
    }
}