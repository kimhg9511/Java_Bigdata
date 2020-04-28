<%@page import="java.util.ArrayList"%>
<%@page import="daodto.ActorDao"%>
<%@page import="daodto.ActorDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Actor Table</h1>
<table border="1">
	<tr>
		<th>actor_id</th>
		<th>first_name</th>
		<th>last_name</th>
		<th>last_update</th>
	</tr>
<%
ActorDao dao = new ActorDao();
ArrayList<ActorDto> actors = dao.actorSelect(10);
for(ActorDto actor:actors){
%>
	<tr>
		<td><%=actor.getActorId()%></td>
		<td><%=actor.getFirstName()%></td>
		<td><%=actor.getLastName()%></td>
		<td><%=actor.getLastUpdate()%></td>
	</tr>		
<%
}
%>
</table>
</body>
</html>