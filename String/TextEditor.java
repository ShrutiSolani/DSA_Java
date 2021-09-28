mport java.util.*;

class Solution {
    public String solve(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(i != s.length()-1 && s.charAt(i) == '<' && s.charAt(i+1) == '-'){
                if(str.length() > 0){
                    str.deleteCharAt(str.length()-1);
                    
                }
                i++;
                
            }
            else{
                    str.append(s.charAt(i));
                }
        }
        return str.toString();
    }
}
