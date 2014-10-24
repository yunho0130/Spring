package org.thinker.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.thinker.bbs.BbsDAO;
import org.thinker.bbs.BbsVO;
import org.thinker.common.Criteria;
import org.thinker.common.GenericDAO;
import org.thinker.member.MemberVO;

public class BbsDAOTest {
	
	BbsDAO dao;
	
	GenericDAO<MemberVO, String> memberDAO;
	
	@Before
	public void setUp() throws Exception {
		
		dao = 
		new BbsDAO();
		
		memberDAO = 
				new GenericDAO<>("org.thinker.member.MemberMapper");
	}

	@Test
	public void test() throws Exception{
		BbsVO vo = new BbsVO();
		vo.setTitle("00asdfasdfasdfasdfadsfadfsadf");
		vo.setContent("casdfasdfea asfe fasfsdf");
		vo.setWriter("user00");
		
		dao.create(vo);
	}
	
	@Test
	public void testread() throws Exception{
		
		BbsVO vo = dao.read(1048607);
		
		System.out.println(vo);
	}
	
	@Test
	public void testread2() throws Exception{
		
		MemberVO vo = memberDAO.read("user00");
		
		System.out.println(vo);
	}
	
	@Test
	public void testList() throws Exception{
		
		Criteria cri = new Criteria();
		
		Map<String,  String> colMap = new HashMap<String, String>();
		colMap.put("t", "title");
		colMap.put("c", "content");
		colMap.put("w", "writer");
		
		cri.setColMap(colMap);
		
		cri.setPage(11);
		cri.setKeyword("123");
		cri.setTypes(new String[]{"t","w"});
		
		List<BbsVO> list = dao.list(cri);
		
		System.out.println(list);
		
		for (BbsVO bbsVO : list) {
			System.out.println(bbsVO);
		}
	}

}
















