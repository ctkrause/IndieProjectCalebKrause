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
<a href="index.jsp">&bull;&nbsp;Home Page</a>&nbsp;&nbsp;&nbsp;
<a href="admin.jsp">&bull;&nbsp;Click Here To Access Admin Page</a>&nbsp;&nbsp;&nbsp;
<a href="register.jsp">&bull;&nbsp;Click Here To Signup As New User</a>&nbsp;&nbsp;&nbsp;
<a href="displayJobs.jsp">&bull;&nbsp;View All Jobs</a>&nbsp;&nbsp;&nbsp;
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
