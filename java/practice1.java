import java.util.*;
//import java.util.Arrays;

class demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your array limit ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter values :");
		for(int a=0;a<arr.length;a++){
			arr[a]=sc.nextInt();
		}
		
		for(int a=0;a<arr.length-1;a=a+2){
			int temp=arr[a];
			arr[a]=arr[a+1];
			arr[a+1]=temp;
		}
		
		System.out.println("new array:");
		
		for(int a=0;a<arr.length;a++){
			System.out.print("\t"+arr[a]);
		}
		
	}
}