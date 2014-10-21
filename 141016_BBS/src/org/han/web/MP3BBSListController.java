package org.han.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.han.web.Criteria;
import org.han.web.PageMaker;
import org.han.web.SimpleCriteria;

/**
 * Servlet implementation class MP3BBSListController
 */
@WebServlet("/list")
public class MP3BBSListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MP3BBSListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PageMaker pm = new PageMaker();
		//명진아 이거때문이야
		Criteria cri = new SimpleCriteria(
				request.getParameter("page"),
				request.getParameterValues("types"),
				request.getParameter("keyword"));
		
		
//		request.setAttribute("list", cri);
		request.setAttribute("pageMaker", pm);
		
		
		request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
	}
		
		
		
	}

