/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class SplitBinaryString {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int x = splitbinary(str);
		if(x == 0){
		    System.out.println(-1);
		}
		else{
		    System.out.println(x);
		}
	}
	
	static int splitbinary(String str){
	    int count = 0,count_1 = 0,count_0 = 0;
	    for(int i = 0;i < str.length(); i++){
	        if(str.charAt(i) == '0'){
	            count_0++;
	        }
	        else{
	            count_1++;
	        }
	        if(count_0 == count_1){
	            count++;
	            count_0 = count_1 = 0;
	        }
	    }
	    return count;
	}
}