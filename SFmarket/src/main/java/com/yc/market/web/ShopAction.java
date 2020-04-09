package com.yc.market.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yc.market.bean.SfUser;
import com.yc.market.biz.BizException;
import com.yc.market.biz.SfUserBiz;

@RestController
public class ShopAction {
	
	@Resource
	SfUserBiz bbiz;
	
	@PostMapping("toshop")
	public ModelAndView shop(SfUser ub,ModelAndView mav,
			HttpSession session) {
		try {
			SfUser buser = bbiz.login(ub);
			session.setAttribute("loginedUser", buser);
			mav.setViewName("shop");
		} catch (BizException e) {
			e.printStackTrace();
			mav.addObject("msg", e.getMessage());
			mav.setViewName("login");
		}
		return mav;
	}

}
