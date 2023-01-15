<%@ page import="org.SebaouneEtSaraoui.models.Commune"%>
    

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Bonjour!</h2>

<%-- <%String nom = (String)request.getAttribute("I"); %> --%>
<%-- <%String Pnom = (String)request.getAttribute("N"); %> --%>

<%Commune com = (Commune)request.getAttribute("Co"); %>
<p>Nom = <%= com.getName() %></p>
<p>ID = <%= com.getId() %></p>

</body>
</html>