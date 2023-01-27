package com.xworkz.kingdom.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1, urlPatterns="/administration")
public class KingServlet extends HttpServlet {
	
	public KingServlet() {
System.out.println("running kingservlet "+this.getClass().getSimpleName());	

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("Running doget in kingservlet ");
		
		String name= req.getParameter("name");
		String region= req.getParameter("region");
		String queens= req.getParameter("queens");
		String dob= req.getParameter("DOB");
		String dod= req.getParameter("DOD");
   
		System.out.println(name);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(dob);
		System.out.println(dod);

		PrintWriter writer= resp.getWriter();
		writer.print("King name " + name + " is sent success");
		writer.print("King region" + region + " is sent success");
		writer.print("King queens" + queens + "is sent success");
		writer.print("King dob"+ dob +"is sent success");
		writer.print("King dod"+ dod +"is sent success");


		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		writer.print("text/html");
		
	}
	@Override
	public void destroy() {
System.out.println("running destroy  in kingservlet");

	}
}
