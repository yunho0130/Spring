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

	<!-- 
	<form action="upload" method="post" enctype="multipart/form-data">
	노래 제목 : <input type="text" name="title" placeholder="노래제목을 입력해주세요"><br>
	가수 : <input type="text" name="art" placeholder="가수이름을 입력해주세요"><br>
	앨범 : <input type="text" name="alb" placeholder="앨범을 입력해주세요"><br>
	장르 : <input type="text" name="cate" placeholder="장르를 입력해주세요"><br>
	노래 설명 : <input type="text" name="desccont" placeholder="노래설명을 입력해주세요"><br>
	작성자 : <input type="text" name="userID" placeholder="작성자를 입력해주세요"><br>
	mp3파일 : <input type="file" name="mp3File"><br>
	<input type="reset" name="초기화">
	<input type="submit" value="등록하기">
	</form>
	 -->
	<form action="upload" method="post"  enctype="multipart/form-data">
						
						<div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">닫기</button>
                        <h4 class="modal-title"><i class="fa fa-envelope-o"></i>MP3 등록</h4>
                    	</div>
	
                        <div class="modal-body">
                            <div class="form-group">
                                <div class="input-group">
                                    <span class="input-group-addon">제목:</span>
                                    <input name="title" type="text" class="form-control" placeholder="노래제목을 입력해주세요">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="input-group">
                                    <span class="input-group-addon">가수:</span>
                                    <input name="art" type="text" class="form-control" placeholder="가수이름을 입력해주세요">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="input-group">
                                    <span class="input-group-addon">앨범:</span>
                                    <input name=alb" type="text" class="form-control" placeholder="앨범을 입력해주세요">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="input-group">
                                    <span class="input-group-addon">장르:</span>
                                    <input name="cate" type="text" class="form-control" placeholder="장르를 입력해주세요">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="input-group">
                                    <span class="input-group-addon">설명:</span>
                                    <input name="desccont" type="text" class="form-control" placeholder="노래설명을 입력해주세요">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="input-group">
                                    <span class="input-group-addon">작성자:</span>
                                    <input name="userID" type="text" class="form-control" placeholder="작성자 ID를 입력해주세요">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="btn btn-success btn-file">
                                    <i class="fa fa-paperclip"></i> MP3파일 등록
                                    <input type="file" name="mp3File"/>
                                </div>
                                <p class="help-block">Max. 10MB</p>
                            </div>

                        </div>
                        <div class="modal-footer clearfix">

                            <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i>취소</button>

                            <button type="submit" class="btn btn-primary pull-left"><i class="fa fa-envelope"></i>등록</button>
                        </div>
                    </form>
	

</body>
</html>