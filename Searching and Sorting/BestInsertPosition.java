public class Solution {	
	public static int bestInsertPos(int [] arr, int n, int m){
		// Write your code here.
        
        int low = 0;
        int high = n-1;
        int mid = low + (high - low)/2;
        
        while(low <= high){
            mid = low + (high - low)/2;
            
            if(arr[mid] == m){
                return mid;
            }
            else if(arr[mid] < m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return low;
	}
}
