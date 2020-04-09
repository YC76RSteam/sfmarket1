package com.yc.market.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.yc.market.bean.SfUser;
import com.yc.market.biz.BizException;
import com.yc.market.biz.SfUserBiz;

@RestController
public class loginAction {
	@Resource
	SfUserBiz ubiz;
	
	@GetMapping("tologin")
	public ModelAndView tologin(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
	
	@PostMapping("login")
	public ModelAndView login(SfUser user,ModelAndView mav,
			HttpSession session) {
		try {
			SfUser buser = ubiz.login(user);
			session.setAttribute("loginedUser", buser);
			mav.setViewName("index");
		} catch (BizException e) {
			e.printStackTrace();
			mav.addObject("msg", e.getMessage());
			mav.setViewName("login");
		}
		return mav;
	}

}
