/*
You are given the root of the Binary Search Tree. You are also provided integers start and end.
You have to return the sum of all the nodes that lie in the inclusive range of start and end.
All the values in the tree are unique
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SumofNodes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while(n-- > 0){
            arr[i++] = sc.nextInt();
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for(int num : arr){
            if(num >= start && num <= end){
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
