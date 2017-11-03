package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(request.getParameter("Email").equals("") && request.getParameter("Phonenumber").equals("") )
		{
			out.println("<!DOCTYPE html>\n" +
					"<html>\n" +
					"<head><title>A Simple Servlet</title></head>\n" +
					"<body><H2>Registration</H2>\n" +
					"<FORM ACTION='http://localhost:9090/myServlet/Hello'>\n" +
					"<p>First name: <INPUT TYPE='TEXT' NAME='firstName' VALUE = " + request.getParameter("firstName") + "></p>" +
					"<p>Last name: <INPUT TYPE='TEXT' NAME='lastName' VALUE = " + request.getParameter("lastName") + "></p>" +
					"<p>E-mail: <INPUT TYPE='TEXT' NAME='Email' VALUE = " + request.getParameter("Email") + "><font color='red'>Enter E-mail</font></p>" +
					"<p>Phone number: <INPUT TYPE='TEXT' NAME='Phonenumber' VALUE = " + request.getParameter("Phonenumber") + "><font color='red'>Enter Phone number</font></p>" +
					"<P><INPUT TYPE='SUBMIT' VALUE='Submit'></p>" +
					"</body></html>");
		}
		
		else if(request.getParameter("Email").equals(""))
		{
			out.println("<!DOCTYPE html>\n" +
					"<html>\n" +
					"<head><title>A Simple Servlet</title></head>\n" +
					"<body><H2>Registration</H2>\n" +
					"<FORM ACTION='http://localhost:9090/myServlet/Hello'>\n" +
					"<p>First name: <INPUT TYPE='TEXT' NAME='firstName' VALUE = " + request.getParameter("firstName") + "></p>" +
					"<p>Last name: <INPUT TYPE='TEXT' NAME='lastName' VALUE = " + request.getParameter("lastName") + "></p>" +
					"<p>E-mail: <INPUT TYPE='TEXT' NAME='Email' VALUE = " + request.getParameter("Email") + "><font color='red'>Enter E-mail</font></p>" +
					"<p>Phone number: <INPUT TYPE='TEXT' NAME='Phonenumber' VALUE = " + request.getParameter("Phonenumber") + "></p>" +
					"<P><INPUT TYPE='SUBMIT' VALUE='Submit'></p>" +
					"</body></html>");
		}
		
		
		else if (request.getParameter("Phonenumber").equals("")) {
			out.println("<!DOCTYPE html>\n" +
					"<html>\n" +
					"<head><title>A Simple Servlet</title></head>\n" +
					"<body><H2>Registration</H2>\n" +
					"<FORM ACTION='http://localhost:9090/myServlet/Hello'>\n" +
					"<p>First name: <INPUT TYPE='TEXT' NAME='firstName' VALUE = " + request.getParameter("firstName") + "></p>" +
					"<p>Last name: <INPUT TYPE='TEXT' NAME='lastName' VALUE = " + request.getParameter("lastName") + "></p>" +
					"<p>E-mail: <INPUT TYPE='TEXT' NAME='Email' VALUE = " + request.getParameter("Email") + "></p>" +
					"<p>Phone number: <INPUT TYPE='TEXT' NAME='Phonenumber' VALUE = " + request.getParameter("Phonenumber") + "><font color='red'>Enter Phone number</font></p>" +
					"<P><INPUT TYPE='SUBMIT' VALUE='Submit'></p>" +
					"</body></html>");
		}
			
		else
		{
		out.println("<!DOCTYPE html>\n" +
				"<html>\n" +
				"<head><title>A Simple Servlet</title></head>\n" +
				"<body><h1>Read Parameters</h1>\n" +
				"<p>firstName : " + request.getParameter("firstName") + "</p>" +
				"<p>secondName : " + request.getParameter("lastName") + "</p>" +
				"</body></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
