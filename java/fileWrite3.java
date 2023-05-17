import java.io.*;
import java.util.*;

class demo{
	public static void main(String k[]){
		try{
			Scanner sc=new Scanner(System.in);
			
			 System.out.println("enter any line :");
			String a=sc.nextLine();
			
			FileWriter fw=new FileWriter("ABC.txt");
			fw.Write(a);
			fw.close();
		}
		
		catch(Exception ett){
			
		}
	}
}