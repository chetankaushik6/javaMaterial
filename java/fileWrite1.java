import java.util.*;
import java.io.IOException;
import java.io.*;

class demo{
	public static void main(String k[]){

		   
		   try{
			   		Scanner scan=new Scanner(System.in);
			   System.out.println("enter text which you want to write in file...");
			   String text=scan.nextLine();
			   
			   FileWriter fw=new FileWriter("d://second.txt");
			   fw.Write(text);
			   fw.close();
		   }
		   
		   catch(Exception e){
			   
		   }
	}
}