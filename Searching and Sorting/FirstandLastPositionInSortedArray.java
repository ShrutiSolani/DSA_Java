import java.util.ArrayList;

public class Solution {
	public static Pair findFirstLastPosition(ArrayList<Integer> arr, int n, int x) {
		int first = -1;
        int last = -1;
        
//         Finding first index
        int low = 0;
        int high = n-1;
        int mid = low + (high - low)/2;
        
        while(low <= high){
            mid = low + (high - low)/2;
            
            if(arr.get(mid) >= x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
            if(arr.get(mid) == x){
                first = mid;
            }
        }
        
//         Finding last index
        low = 0;
        high = n-1;
        
        while(low <= high){
            mid = low + (high - low)/2;
            
            if(arr.get(mid) <= x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            
            if(arr.get(mid) == x){
                last = mid;
            }
        }
        
        Pair occurrence = new Pair();
        occurrence.first = first;
        occurrence.second = last;
        return occurrence;
	}
}
