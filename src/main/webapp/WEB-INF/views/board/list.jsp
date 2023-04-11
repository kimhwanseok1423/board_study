<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<style type="text/css">
#bodywrap {
	width: 80%;
	margin: 10px auto;
}

table, tr, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

.pagelist a {
	text-decoration: none;
	color: black;
}

.pagelist a:hover, .pagelist .pagecolor {
	text-decoration: underline;
	color: red
}
</style>
</head>
<body>
<p>
<a href="/board/write.do">게시물 작성</a>
</p>

	<table>
		<tr>
			<th width="5%">번호</th>
			<th width="5%">제목</th>
			<th width="5%">글쓴이</th>
			<th width="5%">조회수</th>
		</tr>
		 <c:forEach items="${aList}" var="item">
		<tr>
		  
			<td>${item.num}</td>
			<td>${item.subject}</td>
			<td>${item.writer}</td>
			<td>${item.readcount}</td>
		</tr>
		</c:forEach>
	</table>
	   <div class="pagelist">
     <!-- 이전 출력 시작 -->
       <c:if test="${pv.startPage>1}">
          <a href="list.sb?currentPage=${pv.startPage-pv.blockPage}">이전</a>
       </c:if>
     <!-- 이전 출력 끝 -->
     
      <!-- 페이지 출력 시작 -->
       <c:forEach var="i" begin="${pv.startPage}"  end="${pv.endPage}">
         <span>
          <c:url var="currPage" value="list.do">
              <c:param name="currentPage" value="${i}" />
           </c:url>  
           <c:choose>
              <c:when test="${i==pv.currentPage}">
                <a href="${currPage}" class="pagecolor">${i}</a>
              </c:when>
              <c:otherwise>
              <a href="${currPage}">${i}</a>
              </c:otherwise>
            </c:choose>
         </span>
       </c:forEach>
      <!-- 페이지 출력 끝 -->
      
      <!-- 다음 출력 시작 -->
       <c:if test="${pv.endPage<pv.totalPage}">
          <a href="list.do?currentPage=${pv.startPage+pv.blockPage}">다음</a>
       </c:if>
     <!-- 다음 출력 끝 -->
      
   </div>
</body>
</html>