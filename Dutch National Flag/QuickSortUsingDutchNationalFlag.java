import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> quickSortUsingDutchNationalFlag(ArrayList<Integer> arr) {
        // Write your code here.
        quickSort(arr, 0, arr.size()-1);
        return arr;
    }
    
     public static void quickSort(ArrayList<Integer> arr, int start, int end){
         if(start >= end){
             return;
         }
         
         int pivot = arr.get(start);
         int low = start;
         int mid = low + 1;
         int high = end;
         
         while(mid <= high){
             if(arr.get(mid) < pivot){
                 int temp = arr.get(mid);
                 arr.set(mid, arr.get(low));
                 arr.set(low, temp);
                 low++;
                 mid++;
             }
             else if(arr.get(mid) > pivot){
                 int temp = arr.get(mid);
                 arr.set(mid, arr.get(high));
                 arr.set(high, temp);
                 high--;
             }
             else{
                 mid++;
             }
         }
         
         quickSort(arr, start, low-1);
         quickSort(arr, high+1, end);
         
     }
}
