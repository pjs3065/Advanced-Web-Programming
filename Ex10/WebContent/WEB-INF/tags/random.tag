<%@ tag language="java" pageEncoding="EUC-KR"%>
<%
	double randomValue = 0;
	int limit = 1;
	try {
		randomValue = (double) (Math.random() * limit);
	} catch (NumberFormatException e) {
	}
%>
<%="randomNumber(" + limit + "): " + randomValue%>
