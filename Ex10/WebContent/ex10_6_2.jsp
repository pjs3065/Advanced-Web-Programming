<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<b>Method:</b>${information.method}<br/>
<b>RequestURI:</b>${information.requestURI}<br/>
<b>QueryString:</b>${information. queryString}<br/>
<b>Protocol:</b>${information.protocol}<br/>
<b>Host:</b>${information.host}<br/>
<b>Connection:</b>${information.connection}<br/>
<b>CacheControl:</b>${information.cachecontrol}<br/>
<b>UserAgent:</b>${information.useragent}<br/>
<b>UpgradeInsecureRequests:</b>${information.upgradeinsecurerequests}<br/>
<b>Accept:</b>${information.accept}<br/>
<b>AcceptEncoding:</b>${information.acceptencoding}<br/>
<b>AcceptLanguage:</b>${information.acceptlanguage}<br/>
</body>

</html>