import java.util.*;


class FindPairs {
	public static int pair(int mat[][], int n) {
		int maxValue = Integer.MIN_VALUE;
		int maxarr[][] = new int[n][n];
		maxarr[n-1][n-1] = mat[n-1][n-1];

		int maxv = maxarr[n-1][n-1];
		for(int i = n-1;i >= 0;i--) {
			if(mat[n-1][i] > maxv){
				maxv = mat[n-1][i];
			}
			maxarr[n-1][i] = maxv;
		}

		maxv = maxarr[n-1][n-1];
		for(int i = n-1;i >= 0;i--) {
			if(mat[i][n-1] > maxv){
				maxv = mat[i][n-1];
			}
			maxarr[i][n-1] = maxv;
		}

		for(int i = n-2;i >= 0; i--) {
			for(int j = n-2;j >= 0; j--){
				if(maxarr[i+1][j+1] - mat[i][j] > maxValue){
					maxValue = maxarr[i+1][j+1] - mat[i][j];
				}

				maxarr[i][j] = Math.max(mat[i][j] , Math.max(maxarr[i+1][j], maxarr[i][j+1]));
			}
		}
		return maxValue;
	}
}



class PairWithMaxDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,n;
		n = sc.nextInt();
		int matrix[][] = new int[n][n];
		for(i = 0;i < n;i++) {
			for(j = 0;j < n;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int ans = FindPairs.pair(matrix, n);
		System.out.println(ans);
	}
}