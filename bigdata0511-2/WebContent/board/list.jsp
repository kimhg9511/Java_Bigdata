<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <%@ include file="/layout/head.jsp" %>
</head>
    
<body>
    <div id="wrap">
        <header>
            <%@ include file="/layout/header.jsp" %>
        </header>
        
        <div id="content-wrap">
        	<%@ include file="list_content.jsp" %> 
        </div>

        <footer>
            <%@ include file="/layout/footer.jsp" %>
        </footer>
      </div>
</body>
</html>