package org.han.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {
	private static Logger logger = LoggerFactory.getLogger(BbsController.class);
	
	@RequestMapping("/index")
	public void doA(@RequestParam(value="p1", defaultValue="") String p1){
		logger.info("doA............");
		logger.info(p1);
//		return "index";
	}
	
}
