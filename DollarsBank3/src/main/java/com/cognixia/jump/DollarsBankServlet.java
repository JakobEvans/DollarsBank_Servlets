package com.cognixia.jump;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DollarsBankServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException
	{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.println("<h1>Hellloooooooooo!!!!!!1</h1>");
		
	}

}
