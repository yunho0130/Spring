<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<ul>
  <c:forEach var="str" varStatus="status" 
    items="${cri.pageMaker.getPageListStr('javascript:goPage(#pno#);') }">
    <a href="${str}"> ${status.index + cri.pageMaker.startPage}</a> 
  </c:forEach>
</ul>