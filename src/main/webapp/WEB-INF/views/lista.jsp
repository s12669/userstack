<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE >
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>App</title>
</head>
<body>
	<spring:url value="/dodaj" var="elementAdd" />
	<a href="${elementAdd}">Add user</a>

    <table border="1">
        <thead>
        <tr>
            <th>#</th>
            <th>Imię</th>
            <th>Nazwisko</th>
            <th>Data urodzenia</th>
            <th>Numer indeksu</th>
            <th>E-mail</th>
        </tr>
        </thead>
        <tbody>
	<c:forEach varStatus="status" var="element" items="${collection}">
        <tr>
            <td>${status.index}</td>
            <td>${element.name}</td>
            <td>${element.surname}</td>
            <td>${element.dateOfBirth}</td>
            <td>${element.indexNumber}</td>
            <td>${element.email}</td>
        </tr>
	</c:forEach>
        </tbody>
    </table>
    <br />
<h1><strong>${info}</strong></h1>
</body>
</html>