import java.util.*;

class hello{
     public static void main(String k[]){
		 Stack<String> st=new Stack<String>();
		 st.push("one");
		 st.push("two");
		 st.push("three");
		 st.push("four");
		 st.push("five");
		 
		 st.pop();
		 
		 Iterator its=st.iterator();
		 while(its.hasNext()){
			 System.out.println(its.next());
		 }
	 }
}