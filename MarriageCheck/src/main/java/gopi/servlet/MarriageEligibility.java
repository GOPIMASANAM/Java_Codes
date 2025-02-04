package gopi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageEligibility extends HttpServlet {
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String name=req.getParameter("pname");
		int age=Integer.parseInt(req.getParameter("page"));
		String gender=req.getParameter("option");
		
		if(gender.equals("Male")) { 
			if(age>21)
			      pw.println("<h2 style='color:red;text-align:center'>Mr. "+name+" U r Eligible to Marriage. ");
			else
			      pw.println("<h2 style='color:red;text-align:center'>Mr. "+name+" U r NOT Eligible to Marriage. ");

		}
		else if(gender.equals("Female")) { 
			if(age>18)
			      pw.println("<h2 style='color:red;text-align:center'>Mr. "+name+" U r Eligible to Marriage. ");
			else
			      pw.println("<h2 style='color:red;text-align:center'>Mr. "+name+" U r NOT Eligible to Marriage. ");

		}

		pw.print("<h6 style='color:green;text-align:center'> <a href='login.html'> <image src='images/rabbit.jpg' width='60px' height='60px'> </a> </h6>");
		
		pw.close();
	}
	
}
