package com.xworkz.webseries.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup=1,urlPatterns="/serial")

public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("created"+ this.getClass().getSimpleName());
	}
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("running init.config");
		}
	@Override
	protected   void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("running doGet in WebSeriesServlet");
		System.out.println(Thread.currentThread().getName());
		
		String name=req.getParameter("WebSeriesName");
        String langauge=req.getParameter("Language");
        String episodes=req.getParameter("Episodes");
		String ott=req.getParameter("Ott");
		String budget=req.getParameter("Budget");
		
		System.out.println(name);
		System.out.println(langauge);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html/>");
		writer.print("<body/>");
		writer.print("<h1/>");
		writer.print("<span style=color:blue;/>");
		writer.print("WebSeriesName"+name+"is sent success");
	
	
}

}

