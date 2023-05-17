import java.util.Scanner;

class demo{
	public static void main(String k[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.println("check your number is prime or not ........");
		int n=ob.nextInt();
		int count=0;
		
		for(int i=2;i<=n/2;i++){
			if((n%i)==0){
				count++;
				break;
			}
		}
		
		if(count!=0){
		     System.out.println(n +" is not prime number");	
		}
		else
		{
			  System.out.println(n +" is prime number");
		}
	}
}