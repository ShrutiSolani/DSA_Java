class Solution {
    public String longestPalindrome(String s) {
        int max_len = 0;
        int range[] = new int[2];
        int p[][] = new int[s.length()][s.length()];
        for(int g = 0;g < s.length(); g++){
            for(int i= 0, j = g; j < s.length(); i++, j++){
               if(g == 0){
                   p[i][j] = 1;
               }
                else if(g == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        p[i][j] = 1;
                    }
                    else{
                        p[i][j] = 0;
                    }
                }
                else{
                    if((s.charAt(i) == s.charAt(j)) && p[i+1][j-1] == 1){
                        p[i][j] = 1;
                    }
                    else{
                        p[i][j] = 0;
                    }
                }
                if(p[i][j] == 1){
                    max_len = g+1;
                    range[0] = i;
                    range[1] = j;
                }
            }
        }
        return s.substring(range[0], range[1]+ 1);
    }
}
