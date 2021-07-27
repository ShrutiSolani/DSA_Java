import java.util.*;

class AlternatePositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++){
			arr[i] = sc.nextInt();
		}
		int new_arr[] = alternate(arr, n);
		for(int i: new_arr){
			System.out.print(i+"\t");
		}
	}

	static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int[] alternate(int arr[], int n){
		int i,j = n-1;
		for(i = 0;i < j;i++){
			if(arr[i] < 0){
				if(arr[j] > 0){
					swap(arr, i, j);
				}
				else{
					while(arr[j] < 0){
						j--;
					}
					swap(arr,i, j);
				}
			}
		}
		for(i = 0;j < n;i+=2){
			swap(arr,i,j);
			j++;
		}
		return arr;
	}
}