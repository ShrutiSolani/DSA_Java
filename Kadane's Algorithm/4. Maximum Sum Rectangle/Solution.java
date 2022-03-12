import java.util.Arrays;
public class Solution
{
    public static boolean areAllNegative(int[] arr){
        for(int num : arr){
            if(num > 0){
                return false;
            }
        }
        return true;
    }
    
    public static int kadane(int[] arr){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        boolean allNegative = areAllNegative(arr);
        if(allNegative){
            return Arrays.stream(arr).max().getAsInt();
        }
        for(int i = 0;i < arr.length;i++){
            curr = curr + arr[i];
            max = Math.max(max, curr);
          if(!allNegative){
              if(curr < 0){
                  curr = 0;
              }
          }
        }
        return max;
    }
    
public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        // Write your code here.
    	int L, R, curr, max;
    	curr = 0;
    max = Integer.MIN_VALUE;
    	for(L = 0;L < m;L++){
            int[] row = new int[n];
            for(R = L;R < m;R++){
                    for(int j = 0;j < n;j++){
                        row[j] += arr[j][R];
                    }
                curr = kadane(row);
//                 System.out.println("l = "+ L);
//                 System.out.println("r = "+ R);
//                 System.out.println("curr = "+ curr);
                max = Math.max(curr, max);
            }
        }
    return max;
    }
}
