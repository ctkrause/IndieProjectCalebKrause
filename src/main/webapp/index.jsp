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

<form action="index">
    <p>Please enter your search criteria:</p>
    <label for="search">Search Criteria:</label>
    <input type="text" id="search" name="search">
    <br>
    <input type="radio" id="company" name="criteria" value="company">
    <label for="company">Company</label><br>
    <input type="radio" id="category" name="criteria" value="category">
    <label for="category">Category</label><br>
    <input type="radio" id="titledescription" name="criteria" value="titledescription">
    <label for="titledescription">Title/Description</label><br>
    <input type="submit" value="Submit">
</form>
<br><br>
<table style="text-align: center; padding: 15px; width: 100%; border-spacing: 15px;">
    <tr>
        <th>Company Name</th>
        <th>Title</th>
        <th>Category</th>
        <th>Candidate Required Location</th>
        <th>Job Posting URL</th>
        <th>Salary</th>
    </tr>
    <c:forEach var="jobs" items="${jobs}">
        <tr>
            <td>${jobs.getCompanyName()}</td>
            <td>${jobs.getTitle()}</td>
            <td>${jobs.getCategory()}</td>
            <td>${jobs.getCandidateRequiredLocation()}</td>
            <td><a href="${jobs.getUrl()}">${jobs.getUrl()}</a></td>
            <td>${jobs.getSalary()}</td>
        </tr>
    </c:forEach>
</table>
<br><br>
</body>
<jsp:include page="footer.jsp" />
</html>

