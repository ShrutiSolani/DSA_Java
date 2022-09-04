import java.util.*;

public class Solution{
	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
		// Write your code here.
        if(arr.size() < 3){
            return false;
        }
        quickSort(arr, 0, arr.size()-1);
        
        for(int i = 0;i < arr.size()-2;i++){
            if(arr.get(i) + arr.get(i+1) > arr.get(i+2)){
                return true;
            }
        }
        
        return false;
	}
    
    
    public static void quickSort(ArrayList<Integer> arr, int start, int end){
        if(start >= end){
            return;
        }
        
        int pivot = arr.get(end);
        int i = start - 1;
        
        for(int j = start; j < end;j++){
            if(arr.get(j) <= pivot){
                i++;
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        
        int temp = arr.get(i+1);
        arr.set(i+1, arr.get(end));
        arr.set(end, temp);
        
        i = i+1;
        
        quickSort(arr, start,i-1);
        quickSort(arr, i+1, end);
    }
}
