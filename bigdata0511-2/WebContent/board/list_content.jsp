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
int pageList = 5;

//글 목록 전체 가져오기
BoardDao dao = BoardDao.getInstance();
ArrayList<BoardDto> boards = dao.getBoardAll(pageNum, pageList);

//전체 list count
int count = dao.getCount();

//page count
int pageCount = (int)Math.ceil((double)count / pageList) ;

%>	
	
<h1 class="content-title">글 목록</h1>
<div id="board-wrap">Total: <%=count %> / Page: <%=pageNum %> / <%=pageCount %>
<%@ include file="/layout/search.jsp" %> 
<table class="pos">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
		</tr>
		<%
		if(boards.size() > 0){
			String viewPath = "";
			for (BoardDto board : boards) {
				viewPath = request.getContextPath()+"/board/view.jsp?idx="+board.getIdx();
				String space = "";
				int spaceCount = board.getIndent() * 3;
				for(int i=0;i<=spaceCount;++i){
					space += "&nbsp;";
				}
		%>
		<tr>
			<td><%=board.getIdx()%></td>
			<td class="btitle"><%=space %><a href="<%=viewPath%>"><%=board.getTitle() %></a></td>
			<td><%=board.getName() %></td>
			<td><%=board.getRegdate() %></td>
			<td><%=board.getHit() %></td>
		</tr>
		<%
			}
		}else{
			out.println("<tr><td colspan='6'>게시글이 없습니다.</td></tr>");
		}
		%>
		<tr>
			<td colspan="5">
				<%
					
					 
					for (int i = 0; i < pageCount; i++) {
				%> <a href="<%=request.getContextPath() %>/index.jsp?page=<%=i+1%>">[<%=i+1%>]
			</a> <%
 	}
 %>
			</td>
		</tr>
		<tr>
			<td colspan="5">
			<a href="<%=request.getContextPath() %>/board/write.jsp" class="btn">글쓰기</a>
			<a href="<%=request.getContextPath() %>/fwrite.jsp" class="btn">파일업로드 글쓰기</a>
			</td>
		</tr>
	</table>
	
	</div>