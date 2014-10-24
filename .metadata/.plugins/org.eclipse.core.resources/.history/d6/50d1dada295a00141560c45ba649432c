<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<ul>
  <c:forEach var="str" varStatus="status" 
    items="${cri.pageMaker.getPageListStr('javascript:goPage(#pno#);') }">
    <li><a href="${str}"> ${status.index + cri.pageMaker.startPage}  </a> </li>
  </c:forEach>
</ul>