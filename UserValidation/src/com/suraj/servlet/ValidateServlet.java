package com.suraj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suraj.dao.IUserDao;
import com.suraj.dao.InvalidUserException;
import com.suraj.dao.UserDAO;
import com.suraj.util.DAOUtility;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		//out.println("<h1>Hello Everyone!</h1>");
		String userName,password;
		userName=request.getParameter("userName");
		password=request.getParameter("password");

		String userType = "Invalid";
		
		
		
		
		
		
		
		try{
			RequestDispatcher requestDispatcher=null;
			 userType=getUserType(userName,password);
		if(userType.equals("Admin")){
			//out.println("<h1> Welcome Admin "+userName+"</h1>");
			requestDispatcher=request.getRequestDispatcher("/admin");
		}
		else if(userType.equals("User")){
			requestDispatcher=request.getRequestDispatcher("/user");
		}
		else{
			requestDispatcher=request.getRequestDispatcher("/invalid");
		}
		requestDispatcher.forward(request, response);
		}
		catch(InvalidUserException | SQLException e){
			out.println(e.getMessage());
		}
		
		
		
	}

	


	private String getUserType(String userName, String password) throws SQLException {
		
		//IUserDao dao=new UserDAO();
		IUserDao dao=DAOUtility.getUserDAO();
		return dao.getUserType(userName, password);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		doGet(request, response);
	}

}
