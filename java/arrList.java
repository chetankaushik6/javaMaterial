import java.util.ArrayList;

class demo{
	public static void main(String k[]){
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(0,30);
		a.add(25);
		a.add(1,15);
		
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		ArrayList<String> anna=new ArrayList<String>();
		
		anna.add("me");
		anna.add("bro");
		anna.add("dost");
		anna.add("you");
		
		
		ArrayList<String> name=new ArrayList<String>();
		
		name.add("chetan");
		name.add("manish");
		name.add("aman");
		name.add("virat");
		
		name.addAll(2,anna);
		for(int i=0;i<name.size();i++){
			System.out.println(name.get(i));
		}
	}
}