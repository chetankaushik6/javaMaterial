import java.util.Scanner;

class demo{
	    
		static int fib(int n){
			if(n==1 ||n==2){
				return n-1;
			}
			else
			{
			   return fib(n-1)+fib(n-2);	
			}
		}
	
	public static void main(String k[]){
		 Scanner scanner=new Scanner(System.in);
		    System.out.println("fibbonacci series limitation :");
			
			int n=scanner.nextInt();
			
			System.out.print("\t"+fib(n));
	}
}