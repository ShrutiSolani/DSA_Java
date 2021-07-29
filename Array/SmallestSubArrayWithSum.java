import java.util.Scanner;

class Solution {
	public static int subarray(int arr[], int n, int x){
		int curr_sum = 0, min_len = n+1;
		int start = 0, end = 0;
		while(end < n){

			while(curr_sum <= x && end < n){
				curr_sum += arr[end];
				end++;
			}

			while(curr_sum > x && start < n){
				if(end-start < min_len){
					min_len = end - start;
				}
				curr_sum -= arr[start];
				start++; 
			}
		}
		return min_len;
	}
}


class SmallestSubArrayWithSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("Enter element - ");
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		Solution ob = new Solution();
		// System.out.println("Before");
		int ans = ob.subarray(arr, n, x);
		// System.out.println("After");
		if(ans == n+1){
			System.out.println("No subarray with sum greater than "+ x + " found.");
		}
		else{
			System.out.println("Subarray length - "+ ans);
		}
				
	}
}