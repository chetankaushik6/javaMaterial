import java.util.Scanner;

class me extends Thread{
	
	public void run(){
	     
		for(int i=0;i<1000;i++){
			System.out.println("..... first");
		}
	}
}


class you extends Thread{
	
	public void run(){
	     
		for(int i=0;i<100;i++){
			System.out.println("..... second");
		}
	}
}


class demo{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		    
			
			me ob=new me();
			ob.start();
			
			try{
				ob.join();
			}
			
			catch(Exception e){}
			
			you o=new you();
			o.start();
			
	}
}