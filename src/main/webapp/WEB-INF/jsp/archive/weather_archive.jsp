<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 27/01/2020
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table>
    <c:forEach items="${weatherList}" var="item">
        <tr>
            <td><c:out value="${item}" /></td>
        </tr>
    </c:forEach>
</table>
