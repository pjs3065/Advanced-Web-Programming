package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello3
 */
@WebServlet("/Hello3")
public class Hello3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello3() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    String select = request.getParameter("select");
	        String query = request.getParameter("query");
		    
		    if ((select != null) && (query != null) && (query.trim().length() > 0)) {
		        String url = "";

		        switch (select) {
		        case "naver":
		            url = "http://search.naver.com/search.naver?query=" + query;
		            break;
		        case "daum":
	                url = "https://search.daum.net/search?" + query;
		            break;
		        case "google":
	                url = "http://www.google.com/search?q=" + query;
		            break;
	            case "yahoo":
	                url = "http://search.yahoo.com/bin/search?p=" + query;
	                break;
	            case "bing":
	                url = "http://www.bing.com/search?q=" + query;
	                break;
		        }
		        response.sendRedirect(url);
		        return;
		    }

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        //로고
	        out.println("<!DOCTYPE html>\n" +
	            "<html>\n" +
	            "<head><title>A Simple Servlet</title>\n" +
	            "<style>body{font-family:times;}</style></head>\n" +
	            "<body><h1 align='center'>Search Front-end</h1>");
	        
	        //검색어 입력 (단, 영어만)
	        out.println("<div align='center'>" +
	            "<form action='Hello3'>" +
	            "<h4>Choose a search engine and enter query keywords.</h4>" +
	            //선택
	            "<select name='select' style='height:16pt'>" +
	            "<option value='naver'>Naver</option>" +
	            "<option value='daum'>Daum</option>" +
	            "<option value='google'>Google</option>" +
	            "<option value='yahoo'>Yahoo</option>" +
	            "<option value='bing'>Bing</option>" +
	            "</select>&nbsp;" +
	            
	            //입력
	            "<input type='text' name='query' value='' style='width:240px'/>" +
	            "<p><input type='submit' value='Search'/></form></div>" +
	        	"</body></html>");
	}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
