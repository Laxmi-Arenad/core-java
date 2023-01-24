package com.xworkz.tunnel.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1, urlPatterns="/component")
public class BridgeServlet extends HttpServlet {

	public BridgeServlet() {
		System.out.println("created."+this.getClass().getSimpleName());
	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  ServletException,IOException {
	System.out.println("get from bridge");
}

@Override
protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException  {
	System.out.println("post from bridge");
	String data="displaying to post method";
	PrintWriter writer=resp.getWriter();
	writer.print(data);
	resp.setContentType("text/plain");
	
}
	@Override
	protected void doPut(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException  {
		System.out.println("put from bridge");
		String data="displaying to put method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override	
	protected void doTrace(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException  {
			System.out.println("trace from bridge");
			String data="diplaying to trace method";
			PrintWriter writer=resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plaipatn");
	}
	@Override			

    protected void doDelete(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException  {
					System.out.println("Delete from bridge");
					String data="displaying to delete method";
					PrintWriter writer=resp.getWriter();
					writer.print(data);
					resp.setContentType("text/plain");
	}
	@Override			
	protected void doOptions(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException  {
						System.out.println("options from bridge");
						String data="displaying to options method";
						PrintWriter writer=resp.getWriter();
						writer.print(data);
						resp.setContentType("text/plain");
	}
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Patch from bridge");
		String data="displaying to head method";
		PrintWriter writer =resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	
	
}
}







