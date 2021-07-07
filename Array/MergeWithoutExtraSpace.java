import java.io.*;
import java.util.*;

class MergeWithoutExtraSpace {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().merge(arr1, arr2, n, m);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr1[i] + " ");
            }
            for (int i = 0; i < m; i++) {
                str.append(arr2[i] + " ");
            }
            System.out.println(str);
        }
    }
}// } Driver Code Ends


class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int gap = (n+m)/2;
        while(gap > 1){
            int i = 0;
            while(i < n && (i+gap) < n){
                if(arr1[i] > arr1[i+gap]){
                    int temp = arr1[i];
                    arr1[i] = arr1[i+gap];
                    arr1[i+gap] = temp;
                }
                i++;
            }
            while((i < n) && (i+gap) < (m+n)){
                if(arr1[i] > arr2[i+gap-n]){
                    int temp = arr1[i];
                    arr1[i] = arr2[i+gap-n];
                    arr2[i+gap-n] = temp;
                }
                i++;
            }
            while(i < (m+n) && (i+gap) < (m+n)){
                if(arr2[i-n] > arr2[i+gap-n]){
                    int temp = arr2[i-n];
                    arr2[i-n] = arr2[i+gap-n];
                    arr2[i+gap-n] = temp;
                }
                i++;
            }
            if(gap%2 != 0){
                gap++;
                gap = gap/2;
            }
            else{
                gap = gap/2;
            }
        }
        if(gap == 1){
            int i = 0;
            while(i < n && (i+gap) < n){
                if(arr1[i] > arr1[i+gap]){
                    int temp = arr1[i];
                    arr1[i] = arr1[i+gap];
                    arr1[i+gap] = temp;
                }
                i++;
            }
             while((i < n) && (i+gap) < (m+n)){
                if(arr1[i] > arr2[i+gap-n]){
                    int temp = arr1[i];
                    arr1[i] = arr2[i+gap-n];
                    arr2[i+gap-n] = temp;
                }
                i++;
            }
            while(i < (m+n) && (i+gap) < (m+n)){
                if(arr2[i-n] > arr2[i+gap-n]){
                    int temp = arr2[i-n];
                    arr2[i-n] = arr2[i+gap-n];
                    arr2[i+gap-n] = temp;
                }
                i++;
            }
        }
    }
}