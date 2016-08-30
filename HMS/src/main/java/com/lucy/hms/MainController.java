package com.lucy.hms;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 메인 페이지
 * @author Administrator
 *
 */
@Controller
public class MainController {
	
	private static final Logger logger = Logger.getLogger(MainController.class);
	
	
	@RequestMapping(value="/", method={RequestMethod.POST, RequestMethod.GET})
	public String main(Model model){
		logger.info("=== 메인페이지 시작!! ===");
		
		logger.info("=== 메인페이지 끝!! ===");
		
		return "Main";
	}
	
}
