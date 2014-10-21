package org.han.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.han.service.MP3Service;
import org.han.vo.MP3VO;

/**
 * Servlet implementation class UpLoadController
 */
@WebServlet("/upload")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*10,      // 10MB
maxRequestSize=1024*1024*50)   // 50MB
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadController() {
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
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/uploadPage.jsp");
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		Part filePart = request.getPart("mp3File");	// file의 parts를 얻음
		try {
//			Mp3File mp3 = new Mp3File(request.getParameter("mp3File"));
//			ServletOutputStream imgOut = response.getOutputStream();
//			
//			if(mp3.hasId3v2Tag()){
//				ID3v2 id3v2tag = mp3.getId3v2Tag();
//				byte[] imageData = id3v2tag.getAlbumImage();
//				imgOut.write(ImageIO.read(new ByteArrayInputStream(imageData)));
//			}
//			
			String Fname = UploadUtil.upload(filePart, "C:\\zzz\\mp3");
			MP3Service service = new MP3Service();
			MP3VO vo = new MP3VO();
			vo.setTitle(request.getParameter("title"));
			vo.setDescCont(request.getParameter("desccont"));
			vo.setCate(request.getParameter("cate"));
			vo.setUserID(request.getParameter("userID"));
			vo.setArt(request.getParameter("art"));
			vo.setAlb(request.getParameter("alb"));
			vo.setFileName(Fname);
			service.uploadMP3(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.sendRedirect("/main");
	}

}
