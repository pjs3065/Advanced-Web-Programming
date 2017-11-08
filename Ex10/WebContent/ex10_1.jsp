<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
#span1 {
	color: red;
}
</style>

</head>
<body>
	<h1>Registration</h1>
	<form action = "ex10_1.jsp">
	<%
		String index[] = { "First name", "Last name", "E-mail", "Phone number" };
		String param[] = { "firstname", "lastname", "email", "phonenumber" };

		String value[] = new String[4];
		String error[] = new String[4];

		boolean isAll = true;

		for (int i = 0; i < index.length; i++) {
			value[i] = request.getParameter(param[i]);
			
			System.out.println(value[i]);

			if (value[i] == null || value[i].length() <= 0) {
				isAll = false;
				error[i] = "<span id = 'span1'>Enter " + index[i] + "</span>";
			}
			else
			{
				error[i] = "";
			}
		}

		for (int i = 0; i < index.length; i++) {
			out.println("<label>" + index[i] + " : </label>");
			
			if (isAll) {
				out.println(value[i]);
			}
			
			else {
				out.println("<input type = 'text' name = '" + param[i] +"'");
				
				if(value[i] == null)
				{
					out.println("</input>");
				}
				else
				{
					out.println(" value = '" + value[i] + "'</input>" + error[i]);
				}
			}
			out.println("<br/>");
		}
	%>
	<p><input type = 'submit' value = 'Register'/></p>
	</form>
</body>
</html>
