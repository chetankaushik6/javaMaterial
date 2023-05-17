import java.util.*;
//import java.util.Arrays;

class demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your array limit ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter values :");
		for(int  a=0;a<arr.length;a++){
			arr[a]=sc.nextInt();
		}
		
		int low=arr[0];
		int big=arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(low<arr[i]){
				//5 45 24
				low=arr[i];
			}
			
		}System.out.print("\t"+low);
	
	
	for(int i=1;i<arr.length;i++){
		if(big>arr[i]){
			//34 50 15
			big=arr[i];
		}
	}
	System.out.print("\t"+big);
  }
}