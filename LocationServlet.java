package com.xworkz.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=2,urlPatterns="/abcd")
public class LocationServlet extends HttpServlet {



	public LocationServlet() {
		System.out.println("created"+ this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException{
		System.out.println("running init in server");
		}
	@Override
	protected   void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("running doPost in server");
		
		String userName=req.getParameter("userName");
        String userEmail=req.getParameter("userEmail");
        String startPoint=req.getParameter("startPoint");
		String destination=req.getParameter("destination");
		String gender=req.getParameter("gender");
		
		
		
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html/>");
		writer.print("<body/>");
		writer.print("<h1/>");
		
		
		if(userName.length()>3 && userEmail.length()>5 && destination.length()>5 && gender.length() >3 && startPoint.length()>=5) {
			writer.print(" <span style='color:green'>");
			writer.print("Sign in successfully");
			writer.print("/span");
			
	    
	}else {
	    	writer.print("<span style='color:red'>");
	    	writer.print("failed to sign in");
	    	writer.print("</span>");
	    	
	    }
	    writer.print(" </h1>");
	    writer.print(" <a href=\"index.html\">home page</a>");
	    writer.print(" <br>");
	    writer.print(" <a href=\"location.html\">sign up for location</a>");
	    writer.print(" </body>");
	    writer.print(" </html>");
		resp.setContentType("/text/plain");
		
		
}

}















