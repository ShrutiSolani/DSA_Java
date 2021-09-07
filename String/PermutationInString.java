// Sliding Window Solution

class Solution {
    public boolean checkArr(int[] s1arr, int[] s2arr){
        for(int i = 0;i < 26; i++){
            if(s1arr[i] != s2arr[i]){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int s1arr[] = new int[26];
        int s2arr[] = new int[26];
        for(int i = 0;i < s1.length(); i++){
            s1arr[s1.charAt(i) - 'a']+= 1;
            s2arr[s2.charAt(i) - 'a']+= 1;
        }
        
        for(int i = 0;i < s2.length() - s1.length(); i++){
            if(checkArr(s1arr, s2arr)){
                return true;
            }
            s2arr[s2.charAt(i+s1.length()) - 'a']+= 1;
            s2arr[s2.charAt(i) - 'a']-=1;
        }
        return checkArr(s1arr, s2arr);
    }
}
