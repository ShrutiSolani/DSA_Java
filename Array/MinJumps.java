import java.lang.*;
import java.io.*;
import java.util.*;
class MinJumps
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends



class Solution{
    static int max(int a, int b){
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }
    
    
    static int minJumps(int[] arr){
        // your code here
        if (arr.length <= 1){
            return 0;
        }
        else if (arr[0] == 0){
            return -1;
        }
        else{
            int maxrange = arr[0];
        int steps = arr[0];
        int jumps = 1;
        int i;
        for(i = 1;i < arr.length; i++){
            if(i == arr.length - 1){
                return jumps;
            }
            maxrange = max(maxrange, i + arr[i]);
            steps --;
            
            if (steps == 0){
                jumps ++;
                if (i >= maxrange){
                    return -1;
                }
                steps = maxrange - i;
            }
        }
        return jumps;
        }
    }
}