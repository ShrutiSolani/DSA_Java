public class Solution {
    public static int search(int arr[], int key) {
        // Find start/ min element of array
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low)/2;
        
        while(low < high){
            mid = low + (high - low)/2;
            if(arr[mid] > arr[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        
//         starting element of original array = low
        int min = low;
        low = 0;
        high = arr.length - 1;
        
//         Find which part of array we need to search in
        if(key >= arr[min] && key <= arr[high]){
            low = min;
        }else{
            high = min;
        }
        
//         binarysearch in that part
        while(low <= high){
            mid = low + (high - low)/2;
            
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                low = mid+1;
            }
            else{
                high = mid-1;
            } 
        }
        
        return -1;
    }
}
