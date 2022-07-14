class Solution {
    public String addStrings(String n1, String n2) {
        StringBuilder num1 = new StringBuilder(n1);
        StringBuilder num2 = new StringBuilder(n2);
        
        while(num1.length() < num2.length()){
            num1 = new StringBuilder("0").append(num1);
        }
        
        while(num2.length() < num1.length()){
            num2 = new StringBuilder("0").append(num2);
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