

class hello{
	public static void main(String args[]){
		
		//autoboxing ....................
		
          int a=10;
            System.out.println("value of a : " + a);

            Integer b=a;
			System.out.println("value of b : " + b);
		   
		   Integer c=Integer.valueOf(a);
			System.out.println("value of c : " + c);
	
	    //unboxing .........................
		
		Integer ob=new Integer(50);
		System.out.println("\n\nvalue of ob " + ob);
		
		int ob1=ob.intValue();
		System.out.println("value of ob1 " + ob1);
		
	    int ob2=ob;
		System.out.println("value of ob2 " + ob2);
		
	}
}