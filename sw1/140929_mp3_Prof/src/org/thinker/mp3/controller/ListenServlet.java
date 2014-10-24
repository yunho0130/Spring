package org.thinker.mp3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListenServlet
 */
@WebServlet("/listen")
public class ListenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String fileName = request.getParameter("song");
		//String fileName = new String(request.getParameter("song").getBytes("8859_1"),"UTF-8");
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/play.jsp");
		dispatcher.forward(request, response);
		
	}

}















