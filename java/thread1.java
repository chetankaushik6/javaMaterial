import java.io.IOException;

class A extends Thread{
    public void run(){
		for(int i=0;i<50;i++){
			System.out.println("ram ram ji....");
		}
	}	
}

class B extends Thread{
	B(String name){
		super(name);
	}
	
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("sita ram ji....");
		}
	}
}

class test{
	public static void main(String k[]){
		A a=new A();
		B b=new B("chetan kaushik");
		a.start();
		
		a.setName("manish kaushik");
		
		try{
			a.join();
		}
		catch(Exception ett){}
		b.start();
		
		System.out.println("sita ram ji...." +b.getName());
		System.out.println("sita ram ji...." +a.getName());
	}
}