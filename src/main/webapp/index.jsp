<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <h2>Users</h2>
    <a href="admin.jsp">Click Here To Access Admin Page</a>
    <table>
        <th>Username</th>
        <th>First Name</th>
        <th>Last Name</th>
        <c:forEach var="users" items="${users}">
            <tr>
                <td>${users.userName}</td>
                <td>${users.firstName}</td>
                <td>${users.lastName}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
