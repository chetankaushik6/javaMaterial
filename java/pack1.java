package calc;

class Calculator{
	public void sum(int a,int b){
		System.out.println("sum is "  +  (a+b));
	}
}

public class pack1{
	public static void main(String k[]){
		Calculator cal=new Calculator();
		cal.sum(10,20);
	}
}