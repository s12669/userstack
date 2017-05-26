<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>App</title>
</head>
<body>
	<br />
	<%--<form:form action="dodaj" modelAttribute="userDTO" method="post">--%>

		<%--<strong>Name</strong>--%>
		<%--<form:errors path="name" cssclass="error" /><br />--%>
		<%--<input type="text" name="name" /><br />--%>

		<%--<strong>Surname</strong>--%>
		<%--<form:errors path="surname" cssclass="error" /><br />--%>
		<%--<input type="text" name="surname" /><br />--%>

		<%--<strong>DateOfBirth</strong>--%>
		<%--<form:errors path="dateOfBirth" cssclass="error" /><br />--%>
		<%--<input type="date" name="dateOfBirth" /><br />--%>

        <%--<strong>IndexNumber</strong>--%>
        <%--<form:errors path="indexNumber" cssclass="error" /><br />--%>
        <%--<input type="text" name="indexNumber" /><br />--%>

        <%--<strong>Email</strong>--%>
        <%--<form:errors path="email" cssclass="error" /><br />--%>
        <%--<input type="text" name="email" /><br />--%>

        <%--<input type="submit" value="Submit form" />--%>
	<%--</form:form>--%>
	<form:form action="dodaj" method="POST" modelAttribute="userDto">
		<table border="1">
			<tbody>
			<tr>
				<th>Imię</th>
				<td>
                    <form:input type="text" path="name" />
                    <c:if test="${pageContext.request.method=='POST'}"><form:errors path="name" /></c:if>
                </td>
			</tr>
			<tr>
				<th>Nazwisko</th>
				<td>
                    <form:input type="text" path="surname" />
                    <c:if test="${pageContext.request.method=='POST'}"><form:errors path="surname" /></c:if>
                </td>
			</tr>
			<tr>
				<th>DataUrodzenia</th>
				<td>
                    <form:input type="date" path="dateOfBirth" />
                    <c:if test="${pageContext.request.method=='POST'}"><form:errors path="dateOfBirth" /></c:if>
                </td>
			</tr>
			<tr>
				<th>NumerIndeksu</th>
				<td>
                    <form:input type="number" path="indexNumber" />
                    <c:if test="${pageContext.request.method=='POST'}"><form:errors path="indexNumber" /></c:if>
                </td>
			</tr>
			<tr>
				<th>Email</th>
				<td>
                    <form:input type="text" path="email" />
                    <c:if test="${pageContext.request.method=='POST'}"><form:errors path="email" /></c:if>
                </td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="Dodaj!" /></td>
			</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>