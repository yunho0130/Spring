<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<ul >
	<c:forEach begin="${pageMaker.first }" end="${pageMaker.last }" var="idx">
	  <li><a href="javascript:_goPage(${idx})">${idx}</a></li>
	</c:forEach>
</ul>
<form method='get' name='pageForm'>
  <input type='hidden' name='page'>

</form>
<script>

function _goPage(num){
	document.pageForm.page.value = num;
	document.pageForm.submit();
	
}
</script>
</body>
</html>









