<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="<%=request.getContextPath() %>/search.jsp" method="get"> 
<select name="keyWord">
	<option value="title">제목(Title)</option>
	<option value="content">내용(Content)</option>
	<option value="name">작성자(Name)</option>
</select>
<input type="text" name="searchWord"> 
<input type="submit" value="Search">
</form>