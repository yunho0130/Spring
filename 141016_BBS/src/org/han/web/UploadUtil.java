package org.han.web;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.Part;

public class UploadUtil {
	
	public static String upload(Part part, String saveDir)throws Exception{
		
		String contentDisp = part.getHeader("content-disposition"); //content-disposition - file이름 따는데 사용하는듯. 자세한건 공부!!
		String[] items = contentDisp.split(";");
		
		String fileName = UUID.randomUUID().toString();	// 유니크한 아이디를 만드는데 사용하며 거의 꼬이는 일이 없어!
		
		for (String s : items) {
            if (s.trim().startsWith("filename")) {
            	//trim 공백제거 startsWith 시작문자열  filename=파일네임
                fileName += "_" + s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }

		part.write(saveDir + File.separator + fileName);
		//해당 OS의 파일경로 (/등등)를 자동으로 생성해줌
		
		return fileName;
	}
}
