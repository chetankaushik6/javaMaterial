import java.util.*;
import java.io.IOException;
import java.io.*;

class demo{
	public static void main(String k[]){

		   
		   try{
			   		Scanner scan=new Scanner(System.in);
			   System.out.println("enter text which you want to write in file...");
			   String text=scan.nextLine();
			   
			   FileOutputStream frs=new FileOutputStream("second.txt");
			   frs.Write(text.getBytes());
			   frs.close();
		   }
		   
		   catch(Exception e){
			   
		   }
	}
}