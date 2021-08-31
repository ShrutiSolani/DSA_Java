class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0){
            return m*n;
        }
        int minA = m, minB = n;
        for(int op[] : ops){
            minA = Math.min(minA, op[0]);
            minB = Math.min(minB, op[1]);
        }
        return minA*minB;
    }
}
