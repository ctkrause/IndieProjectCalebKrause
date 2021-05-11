<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"
         import="caleb.indie.entity.*"%>
<head>
    <title>Work Search Agg</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <!-- jQuery Data Tables -->
    <link rel="stylesheet" href="//cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css"/>
    <script src="//cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>

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
<table style="text-align: center; padding: 15px; width: 100%; border-spacing: 15px;" id="example" class="display">
    <thead>
    <tr>
        <th>Company Name</th>
        <th>Title</th>
        <th>Category</th>
        <th>Candidate Required Location</th>
        <th>Job Posting URL</th>
        <th>Salary</th>
    </tr>
    </thead>
    <tbody>
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
    </tbody>
</table>
<br><br>
<script type="text/javascript" class="init">
    $(document).ready( function() {
        $('#example').DataTable( {
            "order": [[ 1, "desc" ]]
        } );
    } );
</script>
</body>
<jsp:include page="footer.jsp" />
</html>

