//Initial Template for Java

import java.util.*;

public class CommonIn3Arrays
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        int i,j,k;
        i = j = k = 0;
        int p1, p2, p3;
        p1 = p2 = p3 = Integer.MIN_VALUE;
        ArrayList<Integer> common = new ArrayList<Integer>();
        
        while((i < n1) && (j < n2) && (k < n3)){
           
                while(i < n1 && A[i] == p1){
                    i++;
                }
                      
                while(j < n2 && B[j] == p2){
                    j++;
                }
            
            
                while(k < n3 && C[k] == p3){
                    k++;
                }
            
            if(i < n1 && j < n2 && k < n3){
                
            
            if(A[i] == B[j] && B[j] == C[k]){
                if(common.contains(A[i]) == false){
                    common.add(A[i]);
                    p1 = A[i];
                    p2 = B[j];
                    p3 = C[k];
                    i++;
                    j++;
                    k++;
                }
            }
            else if(B[j] > A[i]){
                p1 = A[i];
                i++;
            }
            else if(C[k] > B[j]){
                p2 = B[j];
                j++;
            }
            else{
                p3 = C[k];
                k++;
            }
            }
        }
        return common;
    }
}