import java.util.*;

class demo{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		ArrayList<String> names=new ArrayList<String>();
		 names.add("manish");
		  names.add("virat");
		  names.add("chetan");
		  names.add(1,"amit");
		  
		  ArrayList<String> surNames=new ArrayList<String>();
		  surNames.add("kaushik");
		  surNames.add("goswami");
		  surNames.add("chauhan");
		  
		  surNames.addAll(names);
		  
		  /*
		  for(int i=0;i<surNames.size();i++){
			  System.out.println(surNames.get(i));
		  }*/
		  
		  surNames.set(2,"anuska sharma");
		    System.out.println(surNames);
	}
}