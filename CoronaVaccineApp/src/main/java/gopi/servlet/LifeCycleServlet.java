package gopi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class LifeCycleServlet extends HttpServlet {

         	static {
         		System.out.println("static Block LifeCyCle");
         	}
         	public LifeCycleServlet() {
         		System.out.println("0-param constructor LifeCyCle");
         		
         	}
         	
         	@Override
         	public void init(ServletConfig cg) throws ServletException {
         	  System.out.println("init() LifeCyCle");
         	}
         	
         	@Override
         	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
         	
         		
         		System.out.println("service method()");
         		PrintWriter pw=res.getWriter();
         		res.setContentType("text/html");
         		pw.println("<h1 style='color:red;text-align:center'>Date and Time:"+new java.util.Date()+"</h1>");
         		pw.close();
         	}
         	@Override
         	public void destroy() {
         	System.out.println("destroy()");
         	}
}

