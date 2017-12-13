package myPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Servlet implementation class CustomerLookupServlet
 */
@WebServlet("/CustomerLookupServlet")
public class CustomerLookupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerLookupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		    CustomerLookupService lookupService =
		        (CustomerLookupService)context.getBean("customerLookupService");
		    String id = request.getParameter("cust-id");
		    String address;
		    if (id.isEmpty()) {
		        address = "missing.jsp";
		    } else {
		        Customer customer = lookupService.getCustomer(id);
		        if (customer == null) {
		            request.setAttribute("id", id);
		            address = "invalid.jsp";
		        } else {
		            request.setAttribute("customer", customer);
		            address = "show-customer.jsp";
		        }
		    }
		    address = "/WEB-INF/jsp/" + address;
		    ColorPreferences colorPreferences =
		            (ColorPreferences)context.getBean("colorPreferences");
		    colorPreferences.setForeground(request.getParameter("fgcolor"));
		    colorPreferences.setBackground(request.getParameter("bgcolor"));

		    RequestDispatcher dispatcher =
		        request.getRequestDispatcher(address);
		    dispatcher.forward(request, response);
	}

}
