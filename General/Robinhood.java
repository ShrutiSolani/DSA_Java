// You are given integers n, e, o, t. You have n dollars in principal that you invested in the stock market. 
// Given the stock market alternates between first returning e and then o percent interest per year, 
// return how many years it would take to reach at least t dollars.

import java.util.*;

class Solution {
    public int solve(int n, int e, int o, int t) {
        if(n > t){
            return 0;
        }
        double p = (double)n;
        int years = 0;
        while(p < t){
            p = p * (1 + (e/100.0));
            years++;
            if(p < t){
                p = p * (1 + (o/100.0));
                years++;
            }
            else{
                break;
            }       
        }
        return years;
    }
}
