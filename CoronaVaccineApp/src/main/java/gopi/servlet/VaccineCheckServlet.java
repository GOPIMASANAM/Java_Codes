package gopi.servlet;

import java.io.IOException;


import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;

//import jakarta.servlet.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/*
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/

public class VaccineCheckServlet extends HttpServlet {
    
	static {
 		System.out.println("static Block VaccineCheckServlet");
 	}
 	public VaccineCheckServlet() {
 		System.out.println("0-param constructor VaccineCheckServlet");
 		
 	}
 	
 	@Override
 	public void init(ServletConfig cg) throws ServletException {
 	  System.out.println("init() VaccineCheckServlet");
 	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("pname");
		String address=req.getParameter("paddr");
		int age=Integer.parseInt(req.getParameter("page"));
		
		if(age<18)
			pw.print("<h1 style='color:pink;text-align:center'>Mr/Miss. "+name+" You are Not eligible for Corona Vaccination </h1>");
		else 
			pw.print("<h1 style='color:pink;text-align:center'>Mr/Miss. "+name+" You are eligible for Corona Vaccination </h1>");
		
		pw.print("<h3 style='text-align:center'><a href='corona_vaccine.html'> <img src='images/home2.jpg'> </a></h3>");
		pw.close();
	}
}
 		