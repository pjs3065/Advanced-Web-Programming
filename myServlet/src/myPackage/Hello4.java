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

		// ��Ű ����
		Cookie[] cookies = request.getCookies();
		Cookie redirection_cookie = null;

		// ���ο������ �ٽ� ���ƿ°����� Ȯ��
		boolean newbie = true;
		boolean redirection = false;

		// html �� �׸���
		String html = "<!DOCTYPE html>\n" + "<html>\n" + "<head><title>A Simple Servlet</title></head>\n"
				+ "<body><h2>Registration</h2>" + "<form action='http://localhost:9090/myServlet/Hello4'>";

		// ��Ű �� Ȯ��
		if (cookies != null) {
			for (Cookie c : cookies) {
				// ���� �湮�߳� Ȯ�� ���࿡ ���� �湮���� ���� cookie�� ���޹����� newbie�� fasle�� �ٲ��ش�.
				if (c.getName().equals("newvisit")) {
					if (c.getValue().equals("yes")) {
						newbie = false;
					}
				}

				// �ٽ� ���ƿ°����� Ȯ�� �ٽ� ���ƿ°��̶�� true�� ǥ��
				if (c.getName().equals("redirection")) {
					redirection_cookie = c;
					if (c.getValue().equals("yes")) {
						redirection = true;
					}
				}
			}
		}

		// ���� �湮�ߴٸ�
		if (newbie) {
			Cookie visitorCookie = new Cookie("newvisit", "yes");
			Cookie visitorDisplay = new Cookie("redirection", "no");

			visitorCookie.setMaxAge(60 * 60 * 24 * 365);
			visitorDisplay.setMaxAge(60 * 60 * 24 * 365);

			response.addCookie(visitorCookie);
			response.addCookie(visitorDisplay);

			// ù ���ο� �湮�϶� �߰� ���ش�.
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

		// ù �湮�� �ƴ� ��쿡
		else {
			// �ٽ� ���ƿԳ� üũ
			if (redirection) {
				for (int i = 0; i < index.length; i++) {
					// �ε����� �Ķ������ ���� �޾ƿ´�.
					String value = request.getParameter(index[i]);
					String name = index[i];
					boolean firstCookie = false;

					if (value != null) {
						for (Cookie c : cookies) {
							if (c.getName().equals(name)) {
								// �ش� ��Ű�� Value�� ���� �������ش�.
								c.setValue(value);
								firstCookie = true;
								break;
							}
						}

						// ���࿡ ��Ű�� ���ٸ� ���ο� ��Ű�� �����Ѵ�.
						if (firstCookie == false) {
							Cookie param = new Cookie(name, value);
							response.addCookie(param);
						}
					}
				}

				// ��Ű�� ����������� redirection_cookie�� yes������ �־��ְ�,
				if (redirection_cookie != null) {
					redirection_cookie.setValue("yes");
				}
				// ���ΰ�ħ
				response.sendRedirect("http://localhost:9090/myServlet/Hello4");
			} 
			
			//�ٽ� ���ƿ°��� �ƴ϶��
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
