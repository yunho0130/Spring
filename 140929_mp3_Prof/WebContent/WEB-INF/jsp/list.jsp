<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body id="body">
<div id="header">
 <div id="header-Bottom">
  </div>
	<!-- <div>
	
    <a href='list?dir=${path}'>
    	<input type="button" value="이전" target='list?dir=${path}'>
	</a>
 	</div>   --> 

 <div id="mainCont">
    
	<div id="centrCol">
      <div id="playListBody">
        <div class="head">
          <p class="right"> 	<div>
    <a href='list?dir=${path}'><input type="button" value="이전"></a>
    <a href="http://localhost:8080/140929_mp3_Prof/"><input type="button" value="처음으로"></a>
    	
	
 	</div> </p>
        </div>
        
<ul>
  <c:forEach var="str" items="${fileList}">
  	<c:choose>
  	<c:when test="${str.lastIndexOf('.mp3') > 0}">
  	  <li><input type="button" id="${str}" value="info" /><a href='listen?song=${param.dir}/${str}' target="songFrame"><span class="glyphicon glyphicon-play-circle"></span>MP3 - ${str}</a>
  	  <script type="text/javascript">
        var hw = document.getElementById('${str}');
        hw.addEventListener('click', function(){
        	var fileinfo = '<h3>'+'이름:'+'${str}'+'<br>'+'유형: '+'MP3 파일'+'</h3>';
            var resultDiv = document.getElementById("testinfo");
            resultDiv.innerHTML = fileinfo;
        })</script></li>
 	</c:when>
 	
 	<c:when test="${str.lastIndexOf('.') > 0}">
  	  <li><input type="button" id="${str}" value="info" /><a href='download?file=${param.dir}/${str}'><span class="glyphicon glyphicon-file"></span>FILE - ${str}</a>
  	  <script type="text/javascript">
        var hw = document.getElementById('${str}');
        hw.addEventListener('click', function(){
        	var fileinfo = '<h3>'+'이름:'+'${str}'+'<br>'+'유형: '+'일반 파일'+'</h3>';
            var resultDiv = document.getElementById("testinfo");
            resultDiv.innerHTML = fileinfo;
        })
    </script></li>
 	</c:when>
 	
  	  <c:otherwise>
  	  <li><input type="button" id="${str}" value="[ + ]" /><a href='list?dir=${param.dir}/${str}'><span class="glyphicon glyphicon-folder-open"></span>[ FOLDER ] ${str}</a>
  	  <script type="text/javascript">
        var hw = document.getElementById('${str}');
        hw.addEventListener('click', function(){
        	
        	var newDIV = document.createElement("div"); // <div>태그 생성
        	hw.appendChild(newDIV);
        	newDIV.setAttribute("id",'${str}');
            var resultDiv = document.getElementById('${str}');
            var xhr = new XMLHttpRequest();
            console.log(xhr);
            xhr.open("get", "/140929_mp3_Prof/list?dir=${param.dir}/${str}", true);
            xhr.send(null);
            xhr.onreadystatechange = function(){
                if(xhr.readyState==4 && xhr.status == 200){
                    var fileList = xhr.responseText;
                    resultDiv.innerHTML = fileList;
                }
            }

        	var fileinfo = '<h3>'+'이름:'+'${str}'+'<br>'+'유형: '+'폴더'+'${param.dir}'+'</h3>';
            var resultDiv = document.getElementById("testinfo");
            resultDiv.innerHTML = fileinfo;
        })</script></li>             
  	  </c:otherwise>
  	  
  	</c:choose> 
  </c:forEach>
 </div>
</div>

<div id="testinfo">
	<h1>Testinfo</h1>
</div>

<div id="leftCol">
      <div id="welcomeBox">
      <br>
        <h3>${fileList.size()} 개의 파일과 폴더가 있습니다.</h3>
        </div>
	</div>

<div id="rightCol">
	<h4>MP3 재생 iframe</h4>
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
</body>
</html>











