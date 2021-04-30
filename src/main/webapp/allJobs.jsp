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
<br><br>
<h2>All Jobs</h2>
<table>
    <th>Company Name</th>
    <th>Job Type</th>
    <th>Salary</th>
    <c:forEach var="jobs" items="${jobsItem}">
        <tr>
            <td>${jobs.companyName}</td>
            <td>${jobs.jobType}</td>
            <td>${jobs.salary}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
