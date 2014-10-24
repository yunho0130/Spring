<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <h3><font color='white'>${param.song}</font></h3>

    <audio controls="controls" src="playSong?song=${param.song}" autoplay="autoplay"></audio>