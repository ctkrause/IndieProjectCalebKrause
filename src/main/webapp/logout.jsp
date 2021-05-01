<%@ page session="true"%>

User '<%=request.getRemoteUser()%>' has been logged out.

<% session.invalidate(); %>

<br/><br/>
<a href="index">Click here to go to home page.</a>
