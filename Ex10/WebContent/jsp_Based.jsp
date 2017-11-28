<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<body>
	<%@ taglib tagdir="/WEB-INF/tags" prefix="myjsp"%> 
	<myjsp:random /><br/>
	<myjsp:randInteger /><br/>
	<myjsp:randInteger limit ="20" /><br/>
	<myjsp:randInteger limit ="30" /><br/>
	<myjsp:randInteger limit ="40" /><br/>
</body>

</html>