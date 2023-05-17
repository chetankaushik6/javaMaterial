import java.util.*;

class demo{
	public static void main(String k[]){
		Scanner scan=new Scanner(System.in);
		
		
		LinkedList<String> animals=new LinkedList<String>();
		animals.add("deer");
		animals.add("lion");
		animals.add("tiger");
		animals.add("jaguar");
		animals.add("panther");
		
		Iterator it=animals.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}