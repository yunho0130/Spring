package org.thinker.mp3.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListController
 */
@WebServlet("/main")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static String path;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//aaa
		String dir = request.getParameter("dir");

		if(dir == null ){
			dir ="";
		}
		
		if(dir.length() > 1){
			// path ������� 
			request.setAttribute("path", dir.substring(0, dir.lastIndexOf("/")));
		}
		path =  "C:\\zzz\\" + dir;
		File root  = new File("C:\\zzz\\" + dir);
		
		String[] fileList = root.list();
		
		request.setAttribute("fileList", Arrays.asList(fileList));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/list.jsp");
		dispatcher.forward(request, response);
	}
}

















