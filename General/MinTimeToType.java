class Solution {
    public int minTimeToType(String word) {
        int second = 0, i, b = 0, p = 0, dist = 0;
        for(i = 0; i < word.length(); i++){
            int x = (int)word.charAt(i) % 97;
            if(p == x){
                second += 1;
            }
            else{
                int a = Math.abs(x-p);
                if(a != 1){
                    b = 26-a;
                }
                else{
                    b = a;
                }
                
                dist = Math.min(a,b);
                second += dist;
                p = x;
                i -= 1;
            }
        }
        return second;
    }
}
