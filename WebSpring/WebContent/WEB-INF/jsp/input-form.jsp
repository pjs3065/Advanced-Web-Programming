<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Web Spring: Bank Customer Lookup</title>
    <style>body{font-family:times;} label{float:left;width:70pt;}</style>
</head>
<body text="${colorPreferences.foreground}"
      bgcolor="${colorPreferences.background}">
<H2>Spring Bank</H2>
<form action="get-customer" method="post">
    <label>Customer ID: </label><input type="text" name="cust-id"/><br/>
    <label>Password: </label><input type="password" name="password"/><br/>
    <label>Foreground: </label><input type="text" name="fgcolor"
        value="${colorPreferences.foreground}"/><br/> 
    <label>Background: </label><input type="text" name="bgcolor"
        value="${colorPreferences.background}"/><p/>
    <input type="submit" value="Show Balance"/>
</form>
</body>
</html>