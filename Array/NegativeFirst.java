import java.io.*;
import java.util.*;

class NegativeFirst {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i, neg, pos, temp;
		for(i = 0;i < n;i++){
		    System.out.println("Enter element ");
		    a[i] = sc.nextInt();
		}

		// Another Approach
		// int low = 0;
		// int high = n-1;
		// while(low <= high){
		// 	if(a[low] < 0 && a[high] < 0){
		// 		low += 1;
		// 	}
		// 	else if(a[low]>0 && a[high] < 0){
		// 		temp = a[low];
		// 		a[low] = a[high];
		// 		a[high] = temp;
		// 		low += 1;
		// 		high -= 1;
		// 	}
		// 	else if(a[low]>0 && a[high] > 0){
		// 		high -= 1;
		// 	}
		// 	else{
		// 		low += 1;
		// 		high -= 1;
		// 	}
		// }

		
		pos = neg = 0;
		while(pos < n){
		    if(a[pos] < 0){
		        temp = a[pos];
		        a[pos] = a[neg];
		        a[neg] = temp;
		        pos += 1;
		        neg += 1;
		    }
		    else{
		        pos += 1;
		    }
		    System.out.println("pos "+pos);
		    System.out.println("neg "+neg);
		}
		StringBuffer str = new StringBuffer();
        for(i=0; i<n; i++){
            str.append(a[i]+" ");
        }
        System.out.println(str);
		
	}
}