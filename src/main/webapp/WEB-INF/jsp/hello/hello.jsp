<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 23/01/2020
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
<h2>${message}</h2>
<text>Podaj nazwę miasta:</text><br>
<form:form action="weather/weather.do" method="GET">
    <input type=”text” name=cityName><br>
    <input type="submit" value="Sprawdź Pogodę"><br>
</form:form>

<%--<a href="weather/weather.do?cityName=${cityName}">Pogoda</a>--%>
</body>
</html>
