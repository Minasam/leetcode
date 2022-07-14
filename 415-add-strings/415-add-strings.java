class Solution {
    public String addStrings(String num1, String num2) {
        while(num1.length() < num2.length()){
            num1 = '0' + num1;
        }
        
        while(num2.length() < num1.length()){
            num2 = '0' + num2;
        }
        int remaining = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i = num1.length()-1; i >= 0; i--){
            int a = num1.charAt(i) - '0';
            int b = num2.charAt(i) - '0';
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