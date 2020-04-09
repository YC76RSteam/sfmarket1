package com.yc.market.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexAction {
	@GetMapping("index")
	public ModelAndView slogin(ModelAndView mav) {
		
		mav.setViewName("index");
		return mav;
	}
	
	

}
