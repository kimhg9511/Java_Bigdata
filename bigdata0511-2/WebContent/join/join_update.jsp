<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<%@ include file="/layout/loginCheck.jsp" %>
<%@ include file="/layout/head.jsp" %>
</head>
    
<body>
    <div id="wrap">
        <header>
            <%@ include file="/layout/header.jsp" %>
        </header>
        
        <div id="content-wrap">
        	<%@ include file="join_update_content.jsp" %> 
        </div>

        <footer>
            <%@ include file="/layout/footer.jsp" %>
        </footer>
      </div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="<%=request.getContextPath() %>/js/join.js"></script>      
</body>
</html>