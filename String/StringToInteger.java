class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        Boolean isNegative = false;
        if(i < s.length() && s.charAt(i) == '-'){
            isNegative = true;
            i++;
        }
        else if(i < s.length() && s.charAt(i) == '+'){
            i++;
        }

        if(i < s.length() && Character.isAlphabetic(s.charAt(i))){
            return 0;
        }
        long x = 0;
     
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            
            x = x*10 + Character.getNumericValue(s.charAt(i));
            if(x > Integer.MAX_VALUE){
                if(isNegative){
                    return Integer.MIN_VALUE;
                }
                else{
                    return Integer.MAX_VALUE;
                }
            }
            // System.out.println(x);
            i++;
        }
            if(isNegative){
                x = (-1)*x;   
            }

        return (int)x;
    }
}
