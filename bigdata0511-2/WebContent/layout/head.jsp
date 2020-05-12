<%
// page 설정 값 처리
// request.getRequestURI() : /jsp/board/list.jsp
String uri = request.getRequestURI();
String[] tmpArr = uri.split("/");
String fileFullName = tmpArr[tmpArr.length-1];
String fileName = fileFullName.split("\\.")[0];


%>

	<meta charset="UTF-8">
    <title><%=fileFullName %></title>
    <link rel="stylesheet" href="/bigdata/css/common.css">
    <link rel="stylesheet" href="http://thedata.kr/css/cssans.min.css">
    <link rel="stylesheet" href="/bigdata/css/<%=fileName %>.css">