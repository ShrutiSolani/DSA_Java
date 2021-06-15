import java.util.*;
import java.io.*;
import java.lang.*;

class CountInversions
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long n)
    {
        long temp[] = new long[(int)n];
        //returning the count of inversions in the array.
        return _mergeSort(arr, temp, 0, n - 1); 
    }
    
    //Function to mergesort the array, which uses divide and conquer algorithm
    //on left and right halves of array for mergesort operation.
    static long _mergeSort(long arr[], long temp[], 
        long left, long right)
    {
        long mid, inv_count = 0; 
        if (right > left) { 
            mid = (right + left) / 2;
            
            //Calling recursive function to sort left half of the array.
            inv_count = _mergeSort(arr, temp, left, mid);
            
            //Calling recursive function to sort right half of the array.
            inv_count += _mergeSort(arr, temp, mid + 1, right);
            
            //Calling merge function which sorts and merges both halves
            //of the array obtained after calling both recursive function.
            inv_count += merge(arr, temp, left, mid + 1, right); 
        } 
        //returning the count of inversions in the array.
        return inv_count; 
    }
    
    //Function to sort and merge two parts of array and return inversion count. 
    static long merge(long arr[], long temp[], long left,
    long mid, long right) 
    { 
        long i, j, k; 
        long inv_count = 0; 
        //i is pointer for left subarray.
        i = left;
        //j is pointer for right subarray.
        j = mid; 
        //k is index for resultant merged subarray.
        k = left; 
        
        //Using two pointers over the array which helps in storing the
        //smaller element and thus merging the subarray.
        while ((i <= mid - 1) && (j <= right)) {
            
            //Comparing element of the array at pointers i and j and accordingly
            //storing the smaller element and updating the pointers.
            if (arr[(int)i] <= arr[(int)j]) { 
                temp[(int)k++] = arr[(int)i++]; 
            } 
            else { 
                temp[(int)k++] = arr[(int)j++]; 
                //Adding the inversions which is the number of elements which 
                //are smaller than arr[j] in the left half of the array.
                inv_count = inv_count + (mid - i); 
            } 
        } 
  
        //Copying the remaining elements of left subarray(if there are any) 
        //to temp.
        while (i <= mid - 1)  
            temp[(int)k++] = arr[(int)i++]; 
  
        //Copying the remaining elements of right subarray(if there are any)
        //to temp.
        while (j <= right) 
            temp[(int)k++] = arr[(int)j++]; 
  
        //Copying back the merged elements to original array.
        for (i = left; i <= right; i++) 
            arr[(int)i] = temp[(int)i]; 
  
        return inv_count; 
    }
    
}