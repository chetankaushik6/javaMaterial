//devide and conquer 

import java.util.Scanner;

 class demo{

         public static void conquer(int arr[],int start, int mid, int end){
			 int mergeArr[]=new int[end-start+1];
			 
			 int idx1=start;
			 int idx2=mid+1;
			 int x=0;
			 
			 while(idx1<=mid && idx2<=end){
				  if(arr[idx1]<=arr[idx2]){
					  mergeArr[x]=arr[idx1];
					  x++;
					  idx1++;
				  }
				  else{
					  mergeArr[x++]=arr[idx2++];
				  }
			 }
			 
			 while(idx1<=mid){
				 mergeArr[x++]=arr[idx1++];
			 }
			 
			 while(idx2<=end){
				 mergeArr[x++]=arr[idx2++];
			 }
			 
			 for(int i=0,j=start;i<mergeArr.length;i++,j++){
				 arr[j]=mergeArr[i];
			 }
		 }

         public static void devide(int arr[],int start,int end){
              
			  if(start>=end){
				  return ;
			  }

		int mid=start+(end-start)/2;
	           
			   devide(arr,start,mid);
               devide(arr,mid+1,end);
			   
			   conquer(arr,start,mid,end);
		 }

	public static void main(String k[]){
		 Scanner ob=new Scanner(System.in);
		 
		 int arr[]={12,32,5,16,8,11};
		 //int n=arr.length();
	     int n=arr.length;
		 
		 //calling 
		 devide(arr,0,n-1);
		 
		 for(int i=0;i<n;i++){
			 System.out.print(arr[i] + " ");
		 }
		 System.out.println();
	}
}