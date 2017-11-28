<%@ tag language="java" pageEncoding="EUC-KR"%>
<%@ attribute name="limit" required="false"%>
<%
	int randomValue = 50;
	try {
		randomValue = (int) ((Math.random()) * Integer.parseInt(limit));
	} catch (NumberFormatException e) {
	}
%>
<%="randomNumber(" + limit + "): " + randomValue %>

