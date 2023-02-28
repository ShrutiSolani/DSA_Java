// Given coordinates in the form of string, print if that cell is white or black.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Chessboard {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = s.charAt(0) - 'a';
        int y = s.charAt(1) - '0';
        if(x % 2 == 0){
            if(y % 2 == 0){
                System.out.println("White");
            }
            else{
                System.out.println("Black");
            }
        }
        else{
            if(y % 2 == 0){
                System.out.println("Black");
            }
            else{
                System.out.println("White");
            }
        }
    }
}
