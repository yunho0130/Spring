<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><font color='white'> [ upload page ]

	<form method="post" action="upload" enctype="multipart/form-data" >
	파일 <input type = "file" name="filename">
<!-- 
	<p> 파일설명 <input type = "text" name="desc"></p> 
	 -->
	<input type='submit' value='upload'></font></h3>
	</form>
	
</body>
</html>