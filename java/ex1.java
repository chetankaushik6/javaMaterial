import java.util.Scanner;
import java.io.IOException;

 class myException extends Exception {
	
		  public String toString(){
			  return "this person is not on earth ";
		  }
		  
		  public String getMessage(){
			  return "person is not exist";
		  }
	
}

class demo{
	public static void main(String k[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age of person:");
		int age=sc.nextInt();
		
		if(age<1){
			try{
				   throw new ArithmaticException("this is also a exception ");
					//	throw new myException();
			}
			
			catch(Exception ett){
				//System.out.println("toString \t"+ ett.toString());
				//System.out.println( ett.getMessage());
				System.out.println(ett);
			}
	
		}
		
		else{
			System.out.println("person is " + age +" old ");
		}
		
	}
}