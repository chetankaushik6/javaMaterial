class demo{
	public static void main(String k[]){
		Integer in=new Integer(100);
		
		//int b=in;
		 int b= in.intValue();
		
		System.out.println(in);
		
		
		System.out.println("after unBoxing " + b);
	}
}