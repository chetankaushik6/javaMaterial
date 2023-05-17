class demo{
	public static void main(String k[]){
		int a=50;
		
		//Integer b=a;
		Integer b=Integer.valueOf(a);
		
		System.out.println(a);
		System.out.println("after autoBoxing "+b);
	}
}