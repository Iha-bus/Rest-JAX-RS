<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Bonjour le monde!</h2>

<%String nom = (String)request.getAttribute("n"); %>
<%String Pnom = (String)request.getAttribute("p"); %>
<p>Nom = <%= nom %></p>
<p>Prenom = <%=Pnom %></p>

</body>
</html>