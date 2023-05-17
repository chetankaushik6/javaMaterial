import javax.servlet.http.*;
import java.io.*;

public class Register extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res){
		{
			
			
			try{
				 
			res.setContentType("text/html");
			String a=req.getParameter("t1");
			String b=req.getParameter("e1");
			String c=req.getParameter("p1");
			
			//database connectivity
			
			PrintWriter pw=res.getWriter();
			pw.print("you are register...");
				
			}
			
			catch(Exception e){}
			
			
			
			
			
			
			
		}
	}
}