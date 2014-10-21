package org.han.service;

import java.util.List;

import org.han.dao.MP3BBSDAOImpl;
import org.han.vo.MP3VO;

public class MP3Service {
	private MP3BBSDAOImpl dao;

	public void setDao(MP3BBSDAOImpl dao) {
		this.dao = dao;
	}

	public List<MP3VO> list(int pageNum) throws Exception {
		return dao.list(pageNum);
	}

	public void uploadMP3(MP3VO vo) throws Exception {
		// dao = new MP3BBSDAOImpl();
		this.dao.addMp3(vo);
	}

	public MP3VO mp3Info(Integer mno) throws Exception {

		MP3VO vo = new MP3VO();
		vo = this.dao.MP3Info(mno);

		return vo;
	}
}
