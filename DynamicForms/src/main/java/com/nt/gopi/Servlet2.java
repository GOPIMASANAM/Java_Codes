package com.nt.gopi;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/secondurl")
public class Servlet2 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	
	String name=req.getParameter("pname");
	String fname=req.getParameter("fname");
	String addres=req.getParameter("address");
	String ms=req.getParameter("ms");
	
	String f2val1=req.getParameter("f2t1");
	String f2val2=req.getParameter("f2t2");

	pw.println("<br><b>form1/req1 data : "+name+"..."+fname+"..."+addres+"..."+ms);
	pw.println("<br><b> form2/req2 data : "+f2val1+"..."+f2val2);
	pw.println("<a href='person_details.html'>home");
		
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
