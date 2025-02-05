package com.nt.gopi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firsturl")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String name=req.getParameter("pname");
		String fname=req.getParameter("fname");
		String addres=req.getParameter("address");
		String ms=req.getParameter("ms");
		
		if(ms.equalsIgnoreCase("married")) {
			pw.println("<form action='secondurl' method='post'>");
			pw.println("<table align='center' bgcolor='pink'>");
			pw.println("<tr><td>spouse name: </td><td><input type='text' name='f2t1'></td></tr>");
			pw.println("<tr><td>No of kids: </td><td><input type='text' name='f2t2'></td></tr>");
			pw.println("<tr><td><input type='submit' value='register'></td><td><input type='submit' value='cancel'></td></tr>");
			pw.println("</table>");		
			pw.println("</form>");
			
		}
		else {
			pw.println("<form action='secondurl' method='post'>");
			pw.println("<table align='center' bgcolor='pink'>");
			pw.println("<tr><td>why do you want marry: </td><td><input type='text' name='f2t1'></td></tr>");
			pw.println("<tr><td>when do you want marry: </td><td><input type='text' name='f2t2'></td></tr>");
			pw.println("<tr><td><input type='submit' value='register'></td><td><input type='submit' value='cancel'></td></tr>");
			pw.println("</table>");		
			pw.println("</form>");
			
		}
		pw.close();
		}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	

}
