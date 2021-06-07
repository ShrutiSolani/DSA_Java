/*package whatever //do not write package name here */

import java.io.*;

class Rotation {
    public static int rotations(String s1, String s2){
        String temp = s1 + s1;
        if(s1.length() == s2.length()){
            if(temp.indexOf(s2) != -1){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
    
    
	public static void main (String[] args) {
		String str1 = "AACD";
        String str2 = "ACDA";
        int x = rotations(str1, str2);
        if(x == 1){
            System.out.println("Strings are rotations of each other");
        }
        else{
            System.out.println("Strings are not rotations of each other");
        }
	}
}
