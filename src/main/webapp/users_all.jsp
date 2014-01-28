<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>

<jsp:useBean id="allUsers" type="java.util.Collection<net.karakhanyan.integration.entity.User>" scope="request"/>
<%--<jsp:useBean id="user" scope="request" type="net.karakhanyan.integration.entity.User"/>--%>
<html><body>

<table border="1">
    <tr>
        <th>User Id</th>
        <th>User Name</th>
    </tr>
    <c:forEach var="user" items="${allUsers}">
        <tr>
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.name}"/></td>
        </tr>
    </c:forEach>
</table>

</body></html>