<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 27/01/2020
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul>
    <c:forEach var="weather" items="${weatherList}" varStatus="status">
        <li>
                <c:out value="${weather}"></c:out>
        </li>
    </c:forEach>
</ul>
