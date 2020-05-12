<%@page import="com.bigdata.dto.BoardFileDto"%>
<%@page import="com.bigdata.dto.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bigdata.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
// 페이지 번호
int pageNum = 0;
if(request.getParameter("page") == null ){
	pageNum = 1; 
}else{
	pageNum = Integer.parseInt(request.getParameter("page"));
}
//한페이지 list count
int pageList = 10;

//글 목록 전체 가져오기
BoardDao dao = BoardDao.getInstance();
ArrayList<BoardFileDto> boards = dao.getBoardFileAll(pageNum, pageList);

//전체 list count
int count = dao.getCount();

//page count
int pageCount = (int)Math.ceil((double)count / pageList) ; // 12 / 5 = (3.0)

%>

<%if(session.getAttribute("id") == null) {%>	
<h1 class="content-title">Main-로그인 전</h1>
<%}else {%>
<h1 class="content-title">Main-로그인 후</h1>
<%} %>
<div id="board-wrap">Total: <%=count %> / Page: <%=pageNum %> / <%=pageCount %>
<%@ include file="/layout/search.jsp" %>
	<table class="pos">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
			<th>File</th>
		</tr>
		<%
		if(boards.size() > 0){
			String viewPath = "";
			for (BoardFileDto board : boards) {
				viewPath = request.getContextPath()+"/board/view.jsp?idx="+board.getIdx();
				String space = "";
				int spaceCount = board.getIndent() * 2;
				for(int i=0;i<=spaceCount;++i){
					space += "&nbsp;";
				}
				String filename = board.getFilename();
		%>
		<tr>
			<td><%=board.getIdx()%></td>
			<td class="btitle"><%=space %><a href="<%=viewPath%>"><%=board.getTitle() %></a></td>
			<td><%=board.getName() %></td>
			<td><%=board.getRegdate() %></td>
			<td><%=board.getHit() %></td>
			<td>
			<%if(filename != null) {%>
			<a href="<%=request.getContextPath()%>/fileupload/<%=filename%>"><%=filename %></a>
			<%} %>
			</td>
		</tr>
		<%
			}
		}else{
			out.println("<tr><td colspan='6'>게시글이 없습니다.</td></tr>");
		}
		%>
		<tr>
			<td colspan="6">
				<%
					for (int i = 1; i <= pageCount; i++) {
				%> 
					<%if(i == pageNum){ %>
					<strong>[<%=i%>]</strong> 
					<%}else{ %>
					<a href="<%=request.getContextPath() %>/index.jsp?page=<%=i%>">[<%=i%>]</a>
					<%} %>
				<%
 					}
 				%>
			</td>
		</tr>
		<tr>
			<td colspan="5">
			<a href="<%=request.getContextPath() %>/board/write.jsp" class="btn">글쓰기</a>
			<a href="<%=request.getContextPath() %>/board/fwrite.jsp" class="btn">파일업로드</a>
			</td>
		</tr>
	</table>
</div>