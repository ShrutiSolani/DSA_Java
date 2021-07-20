/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class PrintAllSubSequences {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
// 		HashSet<String> ans = new HashSet<String>(findSubseq(str));
        findSubseq(str);
		System.out.println(sub);
	}
	static HashSet<String> sub = new HashSet<String>();
	static void findSubseq(String a){
	    int n = a.length();
	    for(int i = 0; i < n; i++){
	        for(int j = n; j >= i; j--){
	            String substr = a.substring(i,j);
	            if(!sub.contains(substr)){
	                sub.add(substr);
	            }
	            for(int k = 1; k < substr.length(); k++){
	                StringBuffer s = new StringBuffer(substr);
	                s.deleteCharAt(k);
	                if(!sub.contains(s)){
	                    sub.add(s.toString());
	                }
	                findSubseq(s.toString());
	            }
	        }
	    }
	   // return sub;
	}
}