import java.util.*;

class demo{
	public static void main(String k[]){
		/*
		Stack ob=new Stack();
		
		    ob.push("chetan");
			ob.push(22.5);
			ob.push(11);
			ob.push("kaushik");
			ob.push(21);
						
		System.out.println(ob);
		System.out.println(ob.peek());

            ob.pop();
			 System.out.println(ob.peek());
		
		*/
		
		Queue<String> qu=new LinkedList<>();
		
		qu.offer("chetan");
		qu.offer("tarun");
		qu.offer("abhishek");
		qu.offer("vishal");
		qu.offer("abhi");
		
		System.out.println(qu);
	    System.out.println(qu.poll());
    }
}
