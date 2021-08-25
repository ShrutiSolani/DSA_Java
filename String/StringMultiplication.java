// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.charAt(0) == '0' || num2.charAt(0) == '0'){
            return "0";
        }
        if(num1.length() == 1 && num2.length() == 1){
            int x = num2.charAt(0) - '0';
            int y = num1.charAt(0) - '0';
            int mul = x*y;
            String str = Integer.toString(mul);
            return str;
        }
        int ans[] = new int[num1.length() + num2.length()];
        int mul = 0,extra = 0,i,j;
        for(i = num2.length()-1; i >= 0; i--){
            for(j = num1.length()-1; j >= 0; j--){
                int x = num2.charAt(i) - '0';
                int y = num1.charAt(j) - '0';
                mul = ans[i+j] + (x*y);
                if(mul > 9){
                    ans[i+j] = mul%10;
                    if(i+j != 0)
                        ans[i+j-1] += mul/10;
                    else
                        extra = mul/10;
                }
                else{
                    ans[i+j] = mul;
                }
            }
        }
        int carry_new = 0;
        for(i = ans.length - 1; i >= 0;i--){
            if(carry_new != 0){
                ans[i] += carry_new;
                carry_new = 0;
            }
            if(ans[i] > 9){
                carry_new = ans[i]/10;
                ans[i] = ans[i]%10;
            }
        }
        String str = new String();
        if(extra != 0){
            str += Integer.toString(extra);
        }
        for(i = 0;i < ans.length-1; i++){
            str += Integer.toString(ans[i]);
        }
        return str;
    }
}
