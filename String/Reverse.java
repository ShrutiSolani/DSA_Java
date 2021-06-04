class Solution {
    public void reverseString(char[] s) {
        int i;
        for(i = 0;i < s.length-1; i++){
            char x = s[s.length - 1];
            for(int j = s.length - 1; j > i; j--){
                s[j] = s[j-1];
            }
            s[i] = x;
        }
    }
}