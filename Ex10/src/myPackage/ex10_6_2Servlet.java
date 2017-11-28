package myPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex10_6_2Servlet")
public class ex10_6_2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ex10_6_2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ex10_6_2 information = new ex10_6_2();
		
		information.setMethod(request.getMethod());
		information.setRequestURI(request.getRequestURI());
		information.setProtocol(request.getProtocol());
		information.setHost(request.getHeader("host"));
		information.setConnection(request.getHeader("connection"));
		information.setCachecontrol(request.getHeader("cache-control"));
		information.setUseragent(request.getHeader("user-agent"));
		information.setUpgradeinsecurerequests(request.getHeader("upgrade-insecure-requests"));
		information.setAccept(request.getHeader("accept"));
		information.setAcceptencoding(request.getHeader("accept-encoding"));
		information.setAcceptlanguage(request.getHeader("accept-language"));
		
		request.setAttribute("information", information);
		RequestDispatcher dispatcher1 = request.getRequestDispatcher ("ex10_6_2.jsp"); 
		dispatcher1.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
