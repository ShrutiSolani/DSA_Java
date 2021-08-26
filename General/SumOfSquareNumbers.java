class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a = 0; Math.pow(a, 2) <= c; a++){
            double b = Math.sqrt(c - Math.pow(a, 2));
            if(b == (int)b){
                return true;
            }
        }
        return false;
    }
}
