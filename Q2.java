import java.util.*;
class Node{
	int data;
	Node next;
}

class LinkedList{
	Node head;
	
	public void insert(int data){
		Node node = new Node();
		node.data = data;
		node.next=null;
		if(head==null){
			head=node;
		}
		else{
			Node n =head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void reverse(Node node){
		node = new Node();
		Node next=null;
		Node current = head;
		Node prev = null;
		
		while(current!=null){
			next = current.next;
			current.next=prev;
			prev=current;
			current = next;
		}
		head = prev;
		
	}
	
	public void display(){
		Node node =head;
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	
}
public class Q2{
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		
		Scanner sc= new Scanner(System.in);
		
		int i = sc.nextInt();
		int a[] = new int[i];
		int n=a.length;
		for(int x= 0;x<n;x++){
			list.insert(a[x]= sc.nextInt());
		}
		list.reverse(list.head);
		list.display();
	}
}