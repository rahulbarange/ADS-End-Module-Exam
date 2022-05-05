import java.util.*;
class Stack1{
	int top;
	static int[] a= new int[10];
	int size;
	Stack1(int i){
		a= new int[i];
		top=-1;
		size=0;
	}
	
	public void push(int value){
		a[++top]=value;
		size++;
	}
	
	public void pop(){
		System.out.println("popped element from stack1 is "+a[top]);
		top--;
	}
	
}
class Stack2{
	int top;
	static int[] a= new int[10];
	int size;
	Stack2(int i){
		a= new int[i];
		top=a.length-1;
		size=0;
	}
	
	public void push(int value){
		a[top--]=value;
		size++;
	}
	
	public void pop(){
		System.out.println("popped element from stack2 is "+a[top]);
		top--;
	}
	
}
class Q3{
	public static void main(String args[]){
		Stack1 stack1 = new Stack1(5);
		Stack1 stack2 = new Stack1(5);
		
		stack1.push(5);
		stack2.push(10);
		stack2.push(15);
		stack1.push(11);
		stack2.push(7);
		stack2.push(40);
		
		stack1.pop();
		stack2.pop();
	}
}