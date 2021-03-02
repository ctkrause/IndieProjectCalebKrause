<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <h2>Users</h2>

    <table cellspacing="0" width="50%">
        <thead>
        <th>Username</th>
        <th>First Name</th>
        <th>Last Name</th>
        </thead>
        <tbody>
        <c:forEach var="users" items="${users}">
            <tr>
                <td>${users.userName}</td>
                <td>${users.firstName}</td>
                <td>${users.lastName}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
