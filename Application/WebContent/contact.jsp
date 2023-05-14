<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="controleur" method="post">
<input type ="text" name="motCle" value="${modele.motCle}"› 
<input type="submit" value= "OK">
 </form>
<table border="1" width="80%">
<tr>
<th>id_contact</th>
<th>nom</th>
<th>prenom</th>
<th>email</th>
<c:forEach items ="${modele.contact}" var="c">
<tr>
<td>${c.id_contact}</td>
<td>${c.nom}</td>
<td>${c.prenom}</td>
<td>${c.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>