package com.lucy.hms;

import javax.servlet.http.HttpServletRequest;

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
	
	
	@RequestMapping(value="/")
	public String main(Model model){
		logger.info("=== 메인페이지 시작!! ===");
		
		logger.info("=== 메인페이지 끝!! ===");
		
		return "/login/login";
//		return "Main";
	}
	
	/**
	 * 로그인 처리
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/login")
	public String login(HttpServletRequest request, Model model){
		
		String sResult = "Main";
		
		String sID = request.getParameter("id");
		String sPW = request.getParameter("password");
		
		logger.info("id : " + sID);
		logger.info("pw : " + sPW);
		
		return sResult;
	}
}
