import java.util.*;
public class Solution {
    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
        quickSort(b, 0, m-1);
        
        List<Integer> freq = new ArrayList<Integer>();
        
        for(int num : a){
            freq.add(binarySearch(b, num));
        }
        
        return freq;
        
    }
    
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int frequency = 0;
        while(low <= high){
            mid = (low + high)/2;
            
            if(arr[mid] <= key){
                frequency += (mid - low + 1);
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return frequency;
    }
    
    public static void quickSort(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }
        
        int pivot = arr[end];
        int i = start - 1;
        
        for(int j = start;j < end;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        
        i = i+1;
        quickSort(arr, start, i-1);
        quickSort(arr, i+1, end);
    }
}
