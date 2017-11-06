package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello4")
public class Hello4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] index = { "first_name", "last_name", "e_mail", "phone_number" };

	public Hello4() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		// 쿠키 생성
		Cookie[] cookies = request.getCookies();
		Cookie redirection_cookie = null;

		// 새로운것인지 다시 돌아온것인지 확인
		boolean newbie = true;
		boolean redirection = false;

		// html 폼 그리기
		String html = "<!DOCTYPE html>\n" + "<html>\n" + "<head><title>A Simple Servlet</title></head>\n"
				+ "<body><h2>Registration</h2>" + "<form action='http://localhost:9090/myServlet/Hello4'>";

		// 쿠키 값 확인
		if (cookies != null) {
			for (Cookie c : cookies) {
				// 새로 방문했냐 확인 만약에 새로 방문했을 때의 cookie를 전달받으면 newbie를 fasle로 바꿔준다.
				if (c.getName().equals("newvisit")) {
					if (c.getValue().equals("yes")) {
						newbie = false;
					}
				}

				// 다시 돌아온것인지 확인 다시 돌아온것이라면 true로 표시
				if (c.getName().equals("redirection")) {
					redirection_cookie = c;
					if (c.getValue().equals("yes")) {
						redirection = true;
					}
				}
			}
		}

		// 새로 방문했다면
		if (newbie) {
			Cookie visitorCookie = new Cookie("newvisit", "yes");
			Cookie visitorDisplay = new Cookie("redirection", "no");

			visitorCookie.setMaxAge(60 * 60 * 24 * 365);
			visitorDisplay.setMaxAge(60 * 60 * 24 * 365);

			response.addCookie(visitorCookie);
			response.addCookie(visitorDisplay);

			// 첫 새로운 방문일때 뜨게 해준다.
			for (int i = 0; i < index.length; i++) {
				String name = index[i];
				String cname = name.substring(0, 1).toUpperCase() + name.substring(1);
				cname = cname.replace("_", (name == "e_mail" ? "-" : " "));

				html += "<div>" + "<label>" + cname + ": " + "</label>" + "<input type='text' name='" + name + "' "
						+ "</input>" + "</div>" + "<br>";
			}
			html += "<input type='submit' value='Register'></input></form>" + "</body></html>";

			out.println(html);
		}

		// 첫 방문이 아닐 경우에
		else {
			// 다시 돌아왔냐 체크
			if (redirection) {
				for (int i = 0; i < index.length; i++) {
					// 인덱스의 파라미터의 값을 받아온다.
					String value = request.getParameter(index[i]);
					String name = index[i];
					boolean firstCookie = false;

					if (value != null) {
						for (Cookie c : cookies) {
							if (c.getName().equals(name)) {
								// 해당 쿠키에 Value를 새로 수정해준다.
								c.setValue(value);
								firstCookie = true;
								break;
							}
						}

						// 만약에 쿠키가 없다면 새로운 쿠키를 생성한다.
						if (firstCookie == false) {
							Cookie param = new Cookie(name, value);
							response.addCookie(param);
						}
					}
				}

				// 쿠키가 만들어졌으면 redirection_cookie를 yes값으로 넣어주고,
				if (redirection_cookie != null) {
					redirection_cookie.setValue("yes");
				}
				// 새로고침
				response.sendRedirect("http://localhost:9090/myServlet/Hello4");
			} 
			
			//다시 돌아온것이 아니라면
			else {
				for (int i = 0; i < index.length; i++) {
					String name = index[i];
					String cname = name.substring(0, 1).toUpperCase() + name.substring(1);
					cname = cname.replace("_", (name == "e_mail" ? "-" : " "));
					String value = request.getParameter(name);

					if ((value == null) || (value.trim().equals(""))) {
						html += "<div>" + "<label>" + cname + ": " + "</label>" + "<input type='text' name='" + name
								+ "'>" + "</input>" + "<span style='color:red'>" + " Enter " + name + "</span>"
								+ "</div>" + "<br>";
					} else {
						html += "<div>" + "<label>" + cname + ": " + "</label>" + "<input type='text' name='" + name
								+ "' " + "value='" + value + "'>" + "</input>" + "</div>" + "<br>";
					}
				}
				html += "<input type='submit' value='Register'></input></form>" + "</body></html>";
				if (redirection_cookie != null)
					redirection_cookie.setValue("no");
				out.println(html);
			}
		}
	}

}
