// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class DetectCycle
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            if( x.detectLoop(head) )
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
// } Driver Code Ends


/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


// Floyd's Algorithm for cycle detection
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node x = head;
        if(head.next == null){
            return false;
        }
        Node y = head.next.next;
        while(y != null){
            x = x.next;
            if(y.next ==x || y == x){
                return true;
            }
            if(y.next == null){
                return false;
            }
            else{
                y = y.next.next;
            }
            
        }
        return false;
    }
}