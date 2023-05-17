import java.util.Scanner;

class A{
	public static void main(String k[]){
		Thread ob=new Thread(){
			public void run(){
				  for(int i=0;i<1000;i++){
					  System.out.println("hi " +i);
				  }
			}
		};
		
		ob.start();
	}
}