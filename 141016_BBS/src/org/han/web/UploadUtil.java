package org.han.web;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.Part;

public class UploadUtil {
	
	public static String upload(Part part, String saveDir)throws Exception{
		
		String contentDisp = part.getHeader("content-disposition"); //content-disposition - file�̸� ���µ� ����ϴµ�. �ڼ��Ѱ� ����!!
		String[] items = contentDisp.split(";");
		
		String fileName = UUID.randomUUID().toString();	// ����ũ�� ���̵� ����µ� ����ϸ� ���� ���̴� ���� ����!
		
		for (String s : items) {
            if (s.trim().startsWith("filename")) {
            	//trim �������� startsWith ���۹��ڿ�  filename=���ϳ���
                fileName += "_" + s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }

		part.write(saveDir + File.separator + fileName);
		//�ش� OS�� ���ϰ�� (/���)�� �ڵ����� ��������
		
		return fileName;
	}
}
