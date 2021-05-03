<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/3/21
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div class="container-fluid">
    <h2>User Display Exercise - Week 1</h2>
    <form action="searchUser" class="form-inline">
        <div class="form-group">
            <label for="searchTerm">Search</label>
            <input type="text" class="form-control" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter last name">
        </div>
        <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
        <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all users</button>
    </form>
</div>
</body>
</html>