<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/3/21
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<a href="index">Back to home page</a>


    <h2>Work Search Aggregator Users</h2>
    <table style="text-align: center; padding: 15px; width: 60%; border-spacing: 15px;">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Username</th>
            <th>Delete/Edit User</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.userName}</td>
                <td><form action="deleteUser" method="post"><input type="submit" name="delete" value="delete"></form></td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
