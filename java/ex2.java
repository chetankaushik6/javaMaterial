import java.util.Scanner;

class RadiusNegEx extends Exception{
	public String toString(){
		return "radius is invalid";
	}
	
	public String getMessage(){
		return "radius must not be negative";
	}
}

class hello{
	
	public static double area(int r) throws RadiusNegEx{
		
		if(r<0){
		    throw new RadiusNegEx();	
		}
		
		double res=Math.PI*r*r;
		return res;
	}
	
	public static int devide(int a,int b)throws ArithmeticException{
		return a/b;
	}
	
	public static void main(String k[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter denominator....");
		int b=scan.nextInt();
		
		try{
			int result=hello.devide(20,b);
		System.out.println("\t"+result);
		
		}
		
		catch(Exception ett){
			System.out.println(ett);
		}
		
		
		System.out.println("enter radius for area ....");
		int rads=scan.nextInt();
		
		double oye=hello.area(rads);
		System.out.println("area of circle is " + oye);
		}
		
	}
