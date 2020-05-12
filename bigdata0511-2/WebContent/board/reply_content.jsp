<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 답변할 글번호 받기
String sIdx = request.getParameter("idx");
int idx = Integer.parseInt(sIdx);	

BoardDao  dao = BoardDao.getInstance();
// 수정할 글 내용 가져오기
BoardDto board = dao.getBoardOne(idx);
String title = "답변 >> " + board.getTitle();
String content = "\n\n======= 원본 =======\n" + board.getContent();
int group = board.getGroup();
int step = board.getStep();
int indent = board.getIndent();

%>		
<h1 class="content-title">글 답변하기</h1>
<div id="board-wrap">
	<form action="<%=request.getContextPath() %>/board/replyOk.jsp" method="post">
		<input type="text" name="idx" value="<%=idx%>">
		<input type="text" name="group" value="<%=group%>">
		<input type="text" name="step" value="<%=step%>">
		<input type="text" name="indent" value="<%=indent%>">
		<table class="pos">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="bname" id="bname" value=""></td>
			</tr>
			<tr>
				<td>E-Mail</td>
				<td><input type="text" name="bemail" id="bemail" value=""></td>
			</tr>
			<tr>
				<td>홈페이지</td>
				<td><input type="text" name="bhomepage" id="bhomepage" value=""></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="btitle" id="btitle" value="<%=title%>"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="bcontent" id="bcontent" cols="30" rows="10"><%=content %></textarea></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="bpw" id="bpw" value=""></td>
			</tr>
		</table>

		<div class="btnwrap">
			<div class="btn" id="replyBtn">답변 완료</div>
			<div class="btn white" id="resetBtn">다시 답변</div>
			<a href="javascript:history.back();" class="btn white"">뒤로</a>
		</div>
	</form>
</div>