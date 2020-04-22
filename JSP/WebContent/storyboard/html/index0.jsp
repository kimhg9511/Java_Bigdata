<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판</title>
    <link rel="shortcut icon" href="../img/title-icon.png" type="image/x-icon">
    <link rel="stylesheet" href="../css/common.css">
</head>
<body>
    <div id="wrap">
        <header>
            <div id="logo">
                <a href="index0.jsp" class="menu">게시판</a>
            </div>
            <div id="nav-bar">
                <ul>
                    <li><a href="login/login.jsp" class="menu">Login</a></li>
                    <li><a href="join/join.jsp" class="menu">회원가입</a></li>
                    <li><a href="index0.jsp" class="menu">게시판</a></li>
                </ul>
            </div>
        </header>
        <div id="content-wrap">
            <div id="table">
                <table>
                    <tr>
                        <th>번 호</th>
                        <th class ="table-contents">제 목</th>
                        <th>작성자</th>
                        <th>작성일</th>
                        <th>조 회</th>
                    </tr>
                    <%for(int i=20;i>0;i--){ %>
                    <tr>
                        <td><%=i %></td>
                        <td class ="table-contents"><a href="board/list.jsp">게시판 글입니다 <%=i %></a></td>
                        <td>김현겸</td>
                        <td>2020/04/16</td>
                        <td>0</td>
                    </tr>
                    <%} %>
                    <tr>
                        <th colspan="5">
                        <%for(int i=1;i<6;i++){ %>
                        <a href="#"><%=i %></a>
                        <%} %>
                        </th>
                    </tr>
                </table>
                <div class="button">
                    <input type="button" value="글쓰기" onclick="location.href = 'login/login.jsp'">
                </div>
            </div>
            <footer>
                이용약관 | 개인정보취급방침<br>
                <span><b>서울특별시 구로구 디지털로 306</span><span>구로동, 대륭포스트타워 2차 212호,218호,219호)</span></b><br>
                <span>t. 02-2082-1688 | F. 031-000-0000</span>  
                <span>Copyright &copy; <b>THEJOEUN ACADEMY Corp.</b></span>  
                <span>All Rights Reserved.</span>
            </footer>
        </div>
    </div>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
    $(window).resize(function(){
        var ht = $('header')[0].offsetHeight + $('#table')[0].offsetHeight + $('footer')[0].offsetHeight;        
        if(ht > window.innerHeight){
            $('footer')[0].style.position = 'relative';
        }else{
            $('footer')[0].style.position = 'absolute';
        }
    }).trigger('resize');
</script>
</body>
</html>