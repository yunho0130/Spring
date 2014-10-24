<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/styles.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<div id="header">
 <div id="menu">  
 <a href="">Version 1.2</a> 
 <a href="http://localhost:8080/140929_mp3_Prof/list">처음으로</a> 
 </div>
 <br>
 <div id="header-Bottom">
      <div id="logoBlock">
        <h1>Mp3 Player</h1>
      </div>
      <div id="navBlock">
        <h3>Servlet & JSP & CSS 실습</h3><br>
        <h3>한잔해: 임성민, 김은애, 김윤형, 황명화, 맹윤호, 최명진, 김동혁</h3>
      </div>
  </div>
	<!-- <div>
	
    <a href='list?dir=${path}'>
    	<input type="button" value="이전" target='list?dir=${path}'>
	</a>
 	</div>   --> 

 <div id="mainCont">
    <div id="leftCol">
      <div id="welcomeBox">
      <br>
        <h3>${fileList.size()} 개의 파일과 폴더가 있습니다.</h3>
        <h5>* 지원되는 기능</h5><br>
        <p>3계층 이상 이전 폴더이동 가능.<br>
		iframe 사용으로 한 페이지에 출력.<br>
		파일 업로드/다운로드. <br>
		하위 폴더에 내려가서 업로드시 해당 폴더에서 업로드.<br>
		업로드시 UUID 지원. <br>
		파일 리스트에서 폴더이면 [] 표시. <br>
		mp3파일은 재생을 그 외 파일은 '강제' 다운로드<br>
		refresh 기능(하위폴더에서도 작동) 
        </p>
        <h5>* 부분지원되는 기능</h5><br>
        <p>한글 이름 파일 다운로드는 되지만 파일명이 깨짐.</p>
        <h5>* 안되는 기능</h5><br>
        <p>업로드시 한글이름 깨짐.
		파일 desc 사용 불가 ㅠㅜ </p>
        </div>
	</div>
	<div id="centrCol">
      <div id="playListTop">
        <h3>파일 및 폴더 목록</h3>
      </div>
      <div id="playListBody">
        <div class="head">
          <p class="left">종류</p>
          <p class="centr">파일명</p>
          <p class="right"> 	<div>
    <a href='list?dir=${path}'>
    	<input type="button" value="이전" target='list?dir=${path}'>
	</a>
 	</div> </p>
        </div>
        
<ul>
  <c:forEach var="str" items="${fileList}">
  	<c:choose>
  	<c:when test="${str.lastIndexOf('.mp3') > 0}">
  	  <li><a href='listen?song=${param.dir}/${str}' target="songFrame">MP3 - ${str}</a></li>
 	</c:when>
 	
 	<c:when test="${str.lastIndexOf('.') > 0}">
  	  <li><a href='download?file=${param.dir}/${str}'>FILE - ${str}</a></li>
 	</c:when>
 	
  	  <c:otherwise>
  	  <li><a href='list?dir=${param.dir}/${str}'>[ FOLDER ] ${str}</a></li>
  	  </c:otherwise>
  	  
  	</c:choose> 
  </c:forEach>
 </div>
</div>

<div id="rightCol">
	<h2>MP3 재생 iframe</h2>
	<iframe name='songFrame' height = 200px>
</iframe>
</div>
  <!--upload 로 연결되는 버튼 만들어줘  -->
<div id="rightCol">
	<form action = "list" method="get">

	<a href='/140929_mp3_Prof/upload' target="uploadFrame">
	<input type="button" value="현재 폴더에 업로드" target="/140929_mp3_Prof/upload">
	</a>
	<a href='list?dir=${param.dir}' target="_parent">
	<input type="button" value="refresh" target="/140929_mp3_Prof/list">
	</a>
	</form>

</ul>

<iframe name='uploadFrame' height = 200px></iframe>
</div>
<div id="footer">
	<div id="footerMenu"> 
	<a href="">2014-09-30</a>
	<a href=""> Developed by 한잔해 </a>
	<a href=""> PS:왜 배경을 검은색으로 했을까....?</a>
	</div>
</body>
</html>











