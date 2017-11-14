<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.Enumeration"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<H2>EX10_4 JAVABEAN</H2>
	<%!private String agent = "";%>
	<%!private String currentagent = "";%>
	<%!private boolean ischeck = false; %>
	<%boolean secondBrowser = false; %>
	<%String currentagent = request.getHeader("user-agent"); %>
	
	
	<jsp:useBean id="ex10_4" class="myPackage.ex10_4" scope="application" />
	
	<% if(!agent.equals("") && !agent.equals(currentagent)){
				secondBrowser = true;
				}%>
	
	<table border="1">
		<tr>
			<td>method :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="method" /></td> <%}%>
			<td><jsp:setProperty name="ex10_4" property="method" value='<%=request.getMethod()%>' /> 
			<jsp:getProperty name="ex10_4" property="method" /></td>
		</tr>
		<tr>
			<td>requestURI :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="queryString" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="queryString" value='<%=request.getRequestURI()%>' /> 
				<jsp:getProperty name="ex10_4" property="queryString" />
			</td>
		</tr>
		<tr>
			<td>protocol :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="protocol" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="protocol" value='<%=request.getProtocol()%>' /> 
				<jsp:getProperty name="ex10_4" property="protocol" />
			</td>
		</tr>
		<tr>
			<td>host :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="host" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="host" value='<%=request.getHeader("host")%>' /> 
				<jsp:getProperty name="ex10_4" property="host" />
			</td>
		</tr>
		<tr>
			<td>connection :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="connection" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="connection" value='<%=request.getHeader("connection")%>' /> 
				<jsp:getProperty name="ex10_4" property="connection" />
			</td>
		</tr>
		<tr>
			<td>cache-control :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="cachecontrol" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="cachecontrol" value='<%=request.getHeader("cache-control")%>' /> 
				<jsp:getProperty name="ex10_4" property="cachecontrol" />
			</td>
		</tr>
		<tr>
			<td>user-agent :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="useragent" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="useragent" value='<%=request.getHeader("user-agent")%>' /> 
				<%
				if(ischeck == false)
				{
					agent = request.getHeader("user-agent");
					ischeck = true;
				}
				%>
				<jsp:getProperty name="ex10_4" property="useragent" />
			</td>
		</tr>
		<tr>
			<td>upgrade-insecure-requests :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="upgradeinsecurerequests" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="upgradeinsecurerequests" value='<%=request.getHeader("upgrade-insecure-requests")%>' /> 
				<jsp:getProperty name="ex10_4" property="upgradeinsecurerequests" />
			</td>
		</tr>
		<tr>
			<td>accept :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="accept" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="accept" value='<%=request.getHeader("accept")%>' /> 
				<jsp:getProperty name="ex10_4" property="accept" />
			</td>
		</tr>
		<tr>
			<td>accept-encoding :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="acceptencoding" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="acceptencoding" value='<%=request.getHeader("accept-encoding")%>' /> 
				<jsp:getProperty name="ex10_4" property="acceptencoding" />
			</td>
		</tr>
		<tr>
			<td>accpet-language :</td>
			<% if(secondBrowser){ %>
			<td><jsp:getProperty name="ex10_4" property="acceptlanguage" /></td> <%}%>
			<td>
				<jsp:setProperty name="ex10_4" property="acceptlanguage" value='<%=request.getHeader("accept-language")%>' /> 
				<jsp:getProperty name="ex10_4" property="acceptlanguage" />
			</td>
		</tr>	
	</table><br/>
	
</body>
</html>