import java.util.*;
 class Q1{
	public static void insertion(int a1[]){
		int value=0;
		int j=0;
		for(int i = a1.length-1 ; i>=0;i--){
			value=a1[i];
			for(j=i; j >0 && a1[j-1]>value;j--){
				a1[j] = a1[j-1];
				System.out.println(Arrays.toString(a1));
				//a1[j]=value;
			}
			a1[j]=value;
		}
	}
	public static void main(String args[]){
	//int[] a1 = {1,2,4,5,3};
	 Scanner sc= new Scanner(System.in);
		
		int i = sc.nextInt();
		int a1[] = new int[i];
		int n=a1.length;
		for(int x= 0;x<n;x++){
			a1[x]= sc.nextInt();
		} 
		//System.out.println(Arrays.toString(a1));
	insertion(a1);
	System.out.print(Arrays.toString(a1));
	}
}