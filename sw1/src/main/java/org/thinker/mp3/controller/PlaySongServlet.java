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
 * Servlet implementation class PlaySongServlet
 */
@WebServlet("/playSong")
public class PlaySongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlaySongServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("audio/mpeg");
		
		String fileName = request.getParameter("song");
		
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


















