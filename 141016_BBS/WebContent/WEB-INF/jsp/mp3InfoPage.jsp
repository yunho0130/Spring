<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mp3InfoPage</title>
</head>
<body>
	<!--정보 띄우기-->
	<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">닫기</button>
    <h4 class="modal-title"><i class="fa fa-envelope-o"></i>MP3 정보</h4>
    </div>
	<h3>${mp3Info.getTitle()}</h3>
	<br>
	<!-- 오디오 실행??? 잘....--> 
	<audio src="play?song=${mp3Info.getFileName()}" controls="" autoplay="" ></audio>
	
	
	<br>

	
	
	
</body>
</html>