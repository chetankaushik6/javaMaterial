import java.util.*;

class demo{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		Vector<Integer> nums=new Vector<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		Iterator its=nums.iterator();
		while(its.hasNext()){
			System.out.println(its.next());
		}
	}
}