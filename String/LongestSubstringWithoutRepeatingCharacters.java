class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")){
            return 1;
        }
        if(s.length() == 1){
            return 1;
        }
        int len = 0;
        int curr_len = 0;
        ArrayList<Character> a = new ArrayList<Character>();
        for(int i = 0;i < s.length(); i++){
            if(a.contains(s.charAt(i))) {
                len = Math.max(curr_len, len);
                int x = a.indexOf(s.charAt(i));
                a.subList(0, x+1).clear();
                a.add(s.charAt(i));
                curr_len = a.size();    
            }
            else{
                a.add(s.charAt(i));
                curr_len = a.size();
            }
        }
        len = Math.max(curr_len, len);
        return len;
    }
}
