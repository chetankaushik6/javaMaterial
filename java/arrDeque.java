import java.util.ArrayDeque;

class demo{
	public static void main(String k[]){
		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		
		a.add(10);
		a.add(20);
		a.addFirst(30);
		a.add(25);
		a.add(15);
		
		/*for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}*/
		
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		//System.out.println(a.get(2));
	}
}