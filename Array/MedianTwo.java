import java.util.*;

class MedianTwo {
	static float MedianOf2(int a, int b) {
		return (float)((a+b) / 2.0);
	}

	static float MedianOf3(int a, int b, int c) {
		return a + b + c - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b,c));
	}

	static float MedianOf4(int a, int b, int c, int d) {
		int Max = Math.max(a, Math.max(b, Math.max(c, d)));
		int Min = Math.min(a, Math.min(b, Math.min(c, d)));
		return (float)((a + b + c + d - Max - Min) / 2.0);
	}

	static float MedianArray(int a[]) {
		int n = a.length;
		if (n == 0) { return -1; }
		if (n%2 == 0) {
			return (float) ((double) (a[n/2] + a[n/2 - 1])/2);
		}
		return a[n / 2];
	}

	static float findMedianUtil(int a[], int n, int b[], int m) {
		if( n == 0) { return MedianArray(b); }
		if( n == 1) {
			if( m == 1) { return MedianOf2(a[0], b[0]); }
			if( m%2 == 1) { return MedianOf2(b[m/2], 
			(int) MedianOf3(a[0], b[m/2 -1], b[m/2 + 1])); }

			return MedianOf3(b[m / 2], b[m/2 - 1], a[0]);
		}

		else if(n == 2) {
			if( m == 2) { return MedianOf4(a[0], a[1], b[0], b[1]); }
			if( m%2 == 1) { return MedianOf3(b[m / 2], Math.max(a[0], b[m / 2 - 1]),
                           Math.min(a[1], b[m / 2 + 1])); }
			return MedianOf4(b[m/2], b[m/2 - 1], Math.max(a[0], b[m/2 - 2]),
				Math.min(a[1], b[m/2 + 1]));
		}

		int ia = (n-1) / 2;
		int ib = (m-1) / 2;

		if(a[ia] <= b[ib]){ return findMedianUtil(Arrays.copyOfRange
			(a, ia, a.length), n/2 + 1, b, m-ia); }

		return findMedianUtil(a, n/2 + 1, Arrays.copyOfRange(b, ib, b.length), m-ia);
	}

	public static void main(String[] args)
	{
		int a[] = {-5, 3, 6, 12, 15};
		int b[] = {-12, -10, -6, -3, 4, 10};

		int n = a.length;
		int m = b.length;
		

		if(n > m) { float x = findMedianUtil(b,m,a,n);
			System.out.println(x);
		}
		float y = findMedianUtil(a,n,b,m);
		System.out.println(y);
 	}
}