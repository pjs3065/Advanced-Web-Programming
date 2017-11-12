<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ page import="java.util.Date"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! int accessCount = 0;
Date previousDate = null;
String previousHost = "no previous host";
%>

	accessCount = <%= accessCount++ %><br>
	<% previousDate = new Date(); %>
	previousDate = <%= previousDate %><br>
	<% previousHost = request.getRemoteHost(); %>
	previousHost = <i><%= previousHost %></i>

</body>
</html>