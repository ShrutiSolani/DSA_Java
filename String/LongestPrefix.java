class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0){
            return prefix;
        }
        for(int i = 0;i < strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j = 0;j < strs.length;j++){
                if((strs[j].length() == i) || strs[j].charAt(i) != c){
                    return prefix;
                }
            }
            prefix += c;
        }
        return prefix;
        
    }
}