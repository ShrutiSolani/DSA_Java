//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        int low, mid, high,temp;
        low = 0;
        high = n-1;
        mid = 0;
        while(mid <= high)
       {
           if(a[mid] == 0){
               temp = a[mid];
               a[mid] = a[low];
               a[low] = temp;
               low += 1;
               mid += 1;
           } 
           else if(a[mid] == 2){
               temp = a[mid];
               a[mid] = a[high];
               a[high] = temp;
               high -= 1;
           }
           else{
               mid += 1;
           }
        }    
        // code here 
        
    }
}

// { Driver Code Starts.

class Sort012 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends