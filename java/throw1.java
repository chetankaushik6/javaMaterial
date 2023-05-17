import java.util.Scanner;
import java.io.IOException;

class myException extends Exception{
	public String toString(){
		return "inValid age ";
	}
	
	public String getMessage(){
		return "i am getMessage";
	}
}

class demo{
	public static void main(String k[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age :");
		int age=sc.nextInt();
		
		if(age<1){
			try{
				throw new myException();
			}
			
			catch(Exception ett){
				//System.out.println(ett.getMessage());
			//	System.out.println(ett.toString());
			
			     System.out.println(ett);
			}
		}
	}
}