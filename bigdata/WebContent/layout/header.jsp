<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String name = (String)session.getAttribute("name");
String nickname = (String)session.getAttribute("nickname");
%>
<header>
	<div id="logo">
		<a href="/index0.jsp" class="menu">게시판</a>
	</div>
	<div id="nav-bar">
		<ul>
		<%if(name == null){ %>
			<li><a href="/bigdata/login/login.jsp" class="menu">Login</a></li>
			<li><a href="/bigdata/join/join.jsp" class="menu">회원가입</a></li>
			<li><a href="/bigdata/index0.jsp" class="menu">게시판</a></li>
			
		<%}else if(name.equals("admin")){ %>
			<li><%=nickname %>(<%=name %>)님 환영합니다.</li>
			<li><a href="/bigdata/login/logout.jsp" class="menu">Logout</a></li>
			<li><a href="/bigdata/index0.jsp" class="menu">게시판</a></li>
			<li><a href="/bigdata/join/userupdate.jsp">회원정보수정</a></li>
			<li><a href="/bigdata/join/userdelete.jsp" class="menu">회원 삭제</a></li>	
		<%}else{ %>
			<li><%=nickname %>(<%=name %>)님 환영합니다.</li>
			<li><a href="/bigdata/login/logout.jsp" class="menu">Logout</a></li>
			<li><a href="/bigdata/index0.jsp" class="menu">게시판</a></li>
			<li><a href="/bigdata/join/userupdate.jsp">회원정보수정</a></li>
			<li><a href="/bigdata/join/join.jsp" class="menu">자기소개</a></li>
		<%} %>
		</ul>
	</div>
</header>
