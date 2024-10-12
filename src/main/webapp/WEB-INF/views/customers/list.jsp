<%--
  Created by IntelliJ IDEA.
  User: Thanh
  Date: 10/11/2024
  Time: 8:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
    table {
        border: 1px solid #000;
    }

    th, td {
        border: 1px dotted #555;
    }
</style>
There are ${customers.size()} customer(s) in list.
<table>
    <caption>Customers List</caption>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${customers}">
        <tr>
            <td>
                <c:out value="${c.customerId}"/>
            </td>
            <td>
                <a href="info.jsp?id=${c.customerId}">${c.customerName}</a>
            </td>
            <td>
                <c:out value="${c.customerMail}"/>
            </td>
            <td>
                <c:out value="${c.customerAddress}"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
