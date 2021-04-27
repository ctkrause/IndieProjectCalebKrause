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
<br><br>
<table>
    <th>Created</th>
    <th>Title</th>
    <th>Location</th>
    <c:forEach var="jobs" items="${jobs}">
        <tr>
            <td>${jobs.created}</td>
            <td>${jobs.title}</td>
            <td>${jobs.location}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
