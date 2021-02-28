<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <h2>Users</h2>

    <table cellspacing="0" width="50%">
        <thead>
        <th>id</th>
        <th>username</th>
        <th>name</th>
        <th>skills</th>
        </thead>
        <tbody>
        <c:forEach var="users" items="${users}">
            <tr>
                <td>${users.id}</td>
                <td>${users.username}</td>
                <td>${users.name}</td>
                <td>${users.skills}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
