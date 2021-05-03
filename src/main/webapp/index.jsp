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
    <a href="index">&bull;&nbsp;Home Page</a>&nbsp;&nbsp;&nbsp;
    <a href="admin.jsp">&bull;&nbsp;Click Here To Access Admin Page</a>&nbsp;&nbsp;&nbsp;
    <a href="register.jsp">&bull;&nbsp;Click Here To Signup As New User</a>&nbsp;&nbsp;&nbsp;
    <br><br>
    <table>
        <tr>
            <th>Company Name</th>
            <th>Title</th>
            <th>Salary</th>
            <th>Candidate Required Location</th>
        </tr>
        <c:forEach var="jobs" items="${jobs}">
            <tr>
                <td>${jobs.getCompanyName()}</td>
                <td>${jobs.getTitle()}</td>
                <td>${jobs.getSalary()}</td>
                <td>${jobs.getCandidateRequiredLocation()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
