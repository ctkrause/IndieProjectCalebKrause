<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/3/21
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>    <link rel="stylesheet"
                href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
                integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
                crossorigin="anonymous">
</head>
<body>
<a href="index">Back to home page</a>

    <h2>Work Search Aggregator Users</h2>
    <table style="text-align: center; padding: 15px; width: 60%; border-spacing: 15px;">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Username</th>
            <th>Id</th>
            <th>Delete User</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.userName}</td>
                <td>${user.id}</td>
                <td><a href="delete?id=${user.id}">Delete User</a></td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
