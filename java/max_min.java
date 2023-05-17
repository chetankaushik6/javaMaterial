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
		
		Arrays.sort(arr);
	
           for(int a=0;a<arr.length;a++){
			  System.out.print("\t"+arr[a]);
		}	
		
		 System.out.print("\n\nmin number of array is "+arr[0]);
		  System.out.print("\nmax number of array is "+arr[arr.length-1]);
	}
}