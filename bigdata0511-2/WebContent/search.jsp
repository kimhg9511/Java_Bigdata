<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>index.jsp</title>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/common.css">
    <link rel="stylesheet" href="http://thedata.kr/css/cssans.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/css/index.css">
</head>
    
<body>
    <div id="wrap">
        <header>
            <%@ include file="/layout/header.jsp" %>
        </header>
        
        <div id="content-wrap">
        	<%@ include file="search_content.jsp" %> 
        </div>

        <footer>
            <%@ include file="/layout/footer.jsp" %>
        </footer>
      </div>
</body>
</html>