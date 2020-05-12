<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<a class="logo" href="/bigdata/index.jsp">
    <b class="cssans:d"></b>
    <b class="cssans:a"></b>
    <b class="cssans:t"></b>
    <b class="cssans:a"></b>
</a>
<%if(session.getAttribute("id") == null) {%>
<nav>
  <ul class="nav-items">
    <li><a href="/bigdata/login/login.jsp">Login</a></li>
    <li> | </li>
    <li><a href="/bigdata/join/join.jsp">회원가입</a></li>
    <li> | </li>
    <li><a href="/bigdata/board/list.jsp">게시판</a></li>
</ul>
</nav>
<%}else{%>
<nav>
  <ul class="nav-items">
    <li><a href="#"><%=session.getAttribute("name") %>(<%=session.getAttribute("id") %>)님 환영합니다!</a></li>
    <li> | </li>
    <li><a href="/bigdata/login/logout.jsp">로그아웃</a></li>
    <li> | </li>
    <li><a href="/bigdata/join/join_update.jsp">회원정보수정</a></li>
    <li> | </li>
    <li><a href="/bigdata/join/join_delete.jsp">회원탈퇴</a></li>
  </ul>
</nav>
<%} %>




