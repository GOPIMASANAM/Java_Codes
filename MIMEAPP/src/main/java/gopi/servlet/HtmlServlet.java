
package gopi.servlet;

import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HtmlServlet extends HttpServlet
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res)throws 
         ServletException,IOException{
		 res.setHeader("refresh", "1");
		 res.setContentType("text/html");
		 PrintWriter pw=res.getWriter();
		 Date d=new Date();
		 pw.println("<p style='Text-align: center'>Welcome to the World ");
		 pw.println(" <br> Hello Gopi </p>");
		 pw.println("<table border='1' align='center'>");
		 
		 pw.println("<tr> <th> Player Nmae </th> <th> Medal </th> <th> Category </th> </tr>");
		 pw.println("<tr> <td> Neeraj Chopra </td> <td> Gold </td> <td> Javalin</td> </tr>");
		 pw.println("<tr> <td> Meera Bhai </> <td> Silver </td> <td> Weight Lift</td> </tr>");
		 pw.println("<tr> <td> Gopi </> <td> Gold </td> <td> Running </td> </tr>");	
		 pw.println("<tr> <td> Ramu </> <td> Bronge </td> <td> Hockeyt </td> </tr> </table>");	
		
		pw.println("<h3>System Date: "+d +"</h3>" );
		pw.println("res hashCode: "+res.hashCode());
		pw.println(" <br> req hashCode: "+req.hashCode());
		pw.println("  <br> Class hashCode: "+d.hashCode());
		pw.println("  <br> Class Name: "+getClass());
		
		
		
		pw.close();	 
	 }
}		 