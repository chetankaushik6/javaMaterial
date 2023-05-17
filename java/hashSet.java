import java.util.HashSet;

class demo{
	public static void main(String k[]){
		HashSet<Integer> a=new HashSet<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(20);
		a.add(25);
		a.add(15);
		a.add(20);
		
		System.out.println(a);
	}
}