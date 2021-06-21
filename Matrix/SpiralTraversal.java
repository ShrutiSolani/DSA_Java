import java.io.*;
import java.util.*;
class SpiralTraversal
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends



class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> a = new ArrayList<Integer>(r*c);
        // code here 
        int minr = 0;
        int minc = 0;
        int maxr = r-1;
        int maxc = c-1;
        int count = 0;
        int i,j;
        int n = r*c;
        while(count < n){
            for(i = minr, j = minc; j <=maxc && count < n;j++){
                a.add(matrix[i][j]);
                count += 1;
            }
            minr += 1;
            
            for(i = maxc, j = minr; j <= maxr && count < n; j++){
                a.add(matrix[j][i]);
                count += 1;
            }
            maxc -= 1;
            
            for(i = maxr, j = maxc; j >= minc && count < n; j--){
                a.add(matrix[i][j]);
                count += 1;
            }
            maxr -= 1;
            
            for(i = minc, j = maxr; j >= minr && count < n; j--){
                a.add(matrix[j][i]);
                count += 1;
            }
            minc += 1;
        }
        
        return a;
    }
}
