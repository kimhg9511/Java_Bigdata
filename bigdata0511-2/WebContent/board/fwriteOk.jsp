<%@page import="com.bigdata.dto.BoardFileDto"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 넘어온 데이터 받기 => dao 보내기
request.setCharacterEncoding("UTF-8");
final String saveFolder = "D:/bigdata/jsp/jspws/bigdata/WebContent/fileupload";
final int maxSize = 1024 * 1024 * 10;

MultipartRequest multi = new MultipartRequest(request, saveFolder, maxSize, "UTF-8", new DefaultFileRenamePolicy());
String filename = multi.getFilesystemName("bfile");
String writer = multi.getParameter("writer");
String name = multi.getParameter("bname");
String email = multi.getParameter("bemail");;
String homepage = multi.getParameter("bhomepage");;
String title = multi.getParameter("btitle");;
String content = multi.getParameter("bcontent");;
String pw = multi.getParameter("bpw");; 
// 글 하나 생성
BoardFileDto board = new BoardFileDto(name, email, homepage, title, content, pw, filename);

//dao
BoardDao dao = BoardDao.getInstance();

// insert
int ri = dao.setBoardFileWrite(board);

// 글 입력 처리 후 이동
%>
<script>
<%if(ri == 1) {%>
	alert('글쓰기 성공');
	location.href='<%=request.getContextPath()%>/findex.jsp';
<%}else{ %>
	alert('글쓰기 실패');
	history.back(); // history.go(-1);
<%} %>
</script>







