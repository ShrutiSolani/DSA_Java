/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class MaxMin {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int max, min,i,k;
		for(i = 0;i < n;i++){
		    System.out.println("Enter element ");
		    a[i] = sc.nextInt();
		}
		if(n%2 == 0){
		    if(a[0]>a[1]){
		        max = a[0];
		        min = a[1];
		    }
		    else{
		        max = a[1];
		        min = a[0];
		    }
		    k = 2;
		}
		else{
		    max = min = a[0];
		    k = 1;
		}
		
		
		for(i = k;i < n;i = i+2){
		    if(a[i]>a[i+1]){
		        if(a[i]>max){
		            max = a[i];
		        }
		        if(a[i+1] < min){
		            min = a[i+1];
		        }
		    }
		    else{
		       if(a[i+1]>max){
		            max = a[i+1];
		        }
		        if(a[i] < min){
		            min = a[i];
		        } 
		    }
		}
		
		System.out.println("Max - "+max);
		System.out.println("Min - "+min);
	}
}