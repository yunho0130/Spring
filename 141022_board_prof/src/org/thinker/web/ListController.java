/*
 * '/list'로 들어올 시 "/WEB-INF/jsp/list.jsp" 페이지 호출
 * 
 */
package org.thinker.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thinker.bbs.BbsVO;
import org.thinker.common.Criteria;

/**
 * Servlet implementation class ListController
 */
@WebServlet("/list")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Get방식으로 URL이 들어올 경우. 
		
		int page = 1;
		//request에서 페이지 번호 뽑아낸다. 못 뽑으면 1. 
		try{
			page = Integer.parseInt(request.getParameter("page"));
		}catch(Exception e){
			page = 1;
		}
		// 토탈 페이지를 임시로 지정. 
		int total  = 352;
		
		System.out.println("PAGE: "+page);
		System.out.println("TOTAL: " +total);
		
		List<BbsVO> list = new ArrayList<>();
		
		// 10개의 더미 데이터 생성. 
		for(int i = 0; i < 10; i++){
			
			BbsVO vo = new BbsVO();
			vo.setBno(i);
			vo.setTitle("AAAAA");
			list.add(vo);
		}
		// 더미데이터 리스트에 추가. 
		request.setAttribute("list", list);
		
		// 검색 기준 생성. (검색을 그대로 물고 가도록) 
		Criteria cri = new Criteria();
		cri.setPage(page);
		cri.setKeyword(request.getParameter("keyword"));
		
		cri.setTypes(request.getParameterValues("types"));
		
		
		System.out.println("---------------");
		System.out.println(cri);
		System.out.println("---------------");
		
		
		cri.setTotal(total);
		
		request.setAttribute("cri", cri);
		
		request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
		
	}


}
