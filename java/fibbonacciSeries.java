import java.util.Scanner;

class demo{
	public static void main(String kk[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("enter limit of fibbonaci series.......");
		int n=10;
		
		int i=0,j=1,sum;
		System.out.print(i+"\t"+j);
		
		for(int k=2;k<n;k++){
			sum=i+j;
			System.out.print("\t"+sum);
			i=j;
			j=sum;
		}
	}
}