package myPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello2")
public class Hello2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Hello2() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userAgent = request.getHeader("User-Agent");
		if (userAgent != null) {
			if (userAgent.contains("Chrome")) {
				out.println("<!DOCTYPE html>\n" + "<html>\n" + "<head><title>A Simple Servlet</title></head>\n"
						+ "<body text='red' bgcolor='yellow'>" + "Hello!" + "</body></html>");
			} else {
				out.println("<!DOCTYPE html>\n" + "<html>\n" + "<head><title>A Simple Servlet</title></head>\n"
						+ "<body text = 'white' bgcolor = 'navy'>" + "Hello!" + "</body></html>");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
