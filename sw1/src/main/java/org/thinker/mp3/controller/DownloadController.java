package org.thinker.mp3.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadController
 */
@WebServlet("/download")
public class DownloadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadController() {
        super();
        // TODO Auto-generated constructor stub
    }

protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/force-download");
//		response.setContentLength((int)f.length());
        //response.setContentLength(-1);
		response.setHeader("Content-Transfer-Encoding", "UTF-8");
		String fileName = request.getParameter("file");
		response.setHeader("Content-Disposition","attachment; filename=\"" + fileName + "\"");//fileName);

		
		System.out.println("Down FileName: "+fileName);
		
		File file = new File("C:\\zzz\\" + fileName);
		
		OutputStream out = response.getOutputStream();
		
		byte[] buffer  = new byte[1024*8];
		
		FileInputStream fin = new FileInputStream(file);
		
		while(true){
			
			int count = fin.read(buffer);
			
			if(count == -1) { break; }
			out.write(buffer,0, count);
		}
		fin.close();
		
	}

}
