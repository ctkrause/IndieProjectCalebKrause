<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Work Search Agg</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<html>
<body>
    <h1>Welcome To Work Search Aggregator</h1>
    <a href="admin.jsp">Click Here To Access Admin Page</a><br>
    <a href="register.jsp">Click Here To Signup As New User</a>
    <a href="listAllJobs.jsp">Click Here To View All Jobs</a>
    <br><br>
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
