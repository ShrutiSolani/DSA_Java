/*
Ashish is provided with a collection of n strings in which some strings are of repeating nature but he has been given with a number k. 
His task is to find the kth unique string. Also before finding the kth unique string he has to sort each individual string beforehand. 
If there are fewer unique strings than k return empty string. 
As his best friend, your task is to help Ashish in accomplishing the task.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class DistinctK {
    static String kthUnique(String[] arr, int k, int n){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        for(String s: arr){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s, 1);
            }
        }

        map.entrySet().removeIf(entry -> entry.getValue() > 1);


        if(map.size() < k-1){
            return "";
        }
        else{
            int index = 0;
            for(String s : map.keySet()){
                if(index == k-1){
                    return s;
                }
                else{
                    index++;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int i = 0;
        while(n-- > 0){
            arr[i++] = sc.next();
        }
        int k = sc.nextInt();
        String result = kthUnique(arr, k, n);
        System.out.println(result);
    }
}
