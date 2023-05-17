import java.util.HashMap;

class demo{
	public static void main(String k[]){
		//Scanner scan=new Scanner(System.in);
		
		HashMap<String,String> hello=new HashMap<String,String>();
		hello.put("chetan","8755855997");
		hello.put("msani","pooja");
		hello.put("hema","chhoti Kallo");
		
		hello.remove("msani");
		
		hello.clear();
		System.out.println(hello);
       		
			
		//System.out.println(hello.get("msani"));
	}
}