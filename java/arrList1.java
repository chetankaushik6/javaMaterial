import java.util.Collections;
import java.util.ArrayList;

class demo{
	public static void main(String k[]){
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(0,30);
		a.add(25);
		a.add(1,15);
		
	/*	for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}*/
		
		Collections.sort(a);
		
			System.out.println(a);
	}
} 	