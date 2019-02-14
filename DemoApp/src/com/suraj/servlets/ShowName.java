package com.suraj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowName extends HttpServlet {

	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		String s1=req.getParameter("Your Name");
		PrintWriter out=res.getWriter();
		String s3=req.getParameter("Your Gender");
		
		int s2=Integer.parseInt(req.getParameter("Your Password"));
			if(s2==1234){
				out.println("Welcome user <br/>");
				out.println();
				out.println(" Hello  "+s1+"<br/>");
				out.println("Your Gender is :"+s3);
			}
			else{
				out.println("Enter Correct Password");
			}
		
		
		
	}

}
