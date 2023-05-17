import java.util.Scanner;

class me extends Thread{
	me(String name){
		System.out.println("I am " + name );
	}
	
	
	
	public void run(){
	      System.out.println("thread constructor is true.....here....");
	/*	while(true){
			System.out.println("thread constructor is true.....here....");
		}*/
	}
}

class demo{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		    
			System.out.println("enter any name :");
			String name=scan.nextLine();
			
			me ob=new me(name);
			ob.start();
			
			System.out.println("id of this thread :\t"+ob.getId());
			System.out.println("name of this thread :\t"+ob.getName());
	}
}