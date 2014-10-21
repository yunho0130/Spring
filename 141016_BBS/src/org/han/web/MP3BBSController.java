package org.han.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.han.service.MP3Service;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/main")
public class MP3BBSController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MP3BBSController() {
        super();
        // TODO Auto-generated constructor stub
    }
	private MP3Service service;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		service = 
				(MP3Service)config.getServletContext().getAttribute("MP3Service");
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PageMaker pageMaker = new PageMaker();
		try {
			String pageNum = request.getParameter("page");
			if(request.getParameter("page") == null) pageNum = "1";
			
			request.setAttribute("MP3List", service.list(Integer.parseInt(pageNum)));
			request.setAttribute("pageMaker", pageMaker);
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/MP3BBS.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
