import java.util.Scanner;

class myThr1 extends Thread{
	public void run(){
		int i=0;
		while(i<500){
			System.out.println("ram ram........");
			i++;
		}
	}
}

class myThr2 extends Thread{
	public void run(){
		int j=-500;
		while(j<0){
			System.out.println("jai shri ram........");
			j++;
		}
	}
}

class myThr3 extends Thread{
	public String name;
	myThr3(String name ){
	//	 this.name=name;
	      super(name);
	}
	
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("name of this thread :\t"+getName());
			
		}
	}
}

class test{
	public static void main(String args[]){
		myThr1 first=new myThr1();
		myThr2 second=new myThr2();
		myThr3 third=new myThr3("chetan kaushik");
		
		third.setPriority(Thread.MAX_PRIORITY);
		first.setPriority(Thread.MIN_PRIORITY);
		
		first.start();
		second.start();
		third.start();
	}
}