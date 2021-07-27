import java.util.*;

class Node {
		int data;
		Node next;

		Node(int x){
			data = x;
			next = null;
		}
	}

class LastToFront {
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
            Node head = new Node(sc.nextInt());
            Node tail = head;
        
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
        
            Solution ob = new Solution();
            head = ob.lastTofirst(head);
            printList(head);     
	}
}

class Solution {
	Node lastTofirst(Node head){
		Node curr  = head.next;
		Node prev = head;
		while(curr.next != null){
			prev = curr;
			curr = curr.next;
		}
		curr.next = head;
		prev.next = null;
		head = curr;
		return head;
	}
}