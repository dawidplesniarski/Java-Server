<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 23/01/2020
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Weather</title>
</head>
<body>
<h1>Weather for city ${weatherName}</h1>
<text>${weatherName}</text><br>
<text>${weatherCod}</text><br>
<text>Temperatura powietrza: ${weatherTemp}</text><br>
<text>Ciśnienie: ${weatherPressure}</text><br>

<a href="../">Back</a>
</body>
</html>
