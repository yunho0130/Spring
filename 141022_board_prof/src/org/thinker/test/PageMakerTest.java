package org.thinker.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.thinker.common.PageMaker;

public class PageMakerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		PageMaker pm = new PageMaker(12,201);
		
		List<String> list = pm.getPageListStr("list?page=#pno#&types=w&types=c&keyword=aaa");
		
		for (String str : list) {
			System.out.println(str);
		}

		
	}

}
