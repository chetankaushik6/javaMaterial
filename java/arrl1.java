import java.util.*;
import java.util.ArrayList;

class demo{
	public static void main(String args[]){
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("chetan kaushik");
		list1.add("manish kaushik");
	    list1.add("anubhav");
		list1.add("gopal");
		
	  Iterator it=list1.iterator();
	  
	  while(it.hasNext()){
		  System.out.println(it.next());
	  }
	
	}
}