class Solution {
    public String addStrings(String num1, String num2) {
        int remaining = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Math.max(num1.length(), num2.length()); i++){
            int a = i  < num1.length() ? num1.charAt(num1.length()-i-1) - '0': 0;
            int b = i  < num2.length() ? num2.charAt(num2.length()-i-1) - '0': 0;
            int sum = a + b + remaining;
            StringBuilder temp = new StringBuilder(sum%10 +"");
            temp.append(sb);
            sb = temp;
            remaining = sum / 10;
        }
        if(remaining > 0){
            StringBuilder temp = new StringBuilder(remaining+"");
            temp.append(sb);
            sb = temp;
        }
        return sb.toString();
    }
}