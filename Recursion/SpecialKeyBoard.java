class Solution{
    static int optimalKeys(int N){
        // code here
        if(N < 7){
            return N;
        }
        
        int[] screen = new int[N];
        for(int i = 0;i < 6;i++){
            screen[i] = i+1;
        }
        for(int i = 6;i < N;i++){
            screen[i] = 0;
            for(int b = i-3;b >= 1;b--){
                int curr = (i-b)*screen[b-1];
                screen[i] = Math.max(screen[i], curr);
            }
        }
        return screen[N-1];
    }
}
