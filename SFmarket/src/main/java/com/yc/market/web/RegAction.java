package com.yc.market.web;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yc.market.bean.SfUser;
import com.yc.market.biz.BizException;
import com.yc.market.biz.SfUserBiz;
import com.yc.market.vo.Result;

@RestController
public class RegAction {
	
	@Resource
	SfUserBiz ubiz;

	@GetMapping("toreg")
	public ModelAndView toreg(ModelAndView mav) {
		mav.setViewName("reg");
		return mav;
	}
	
	@PostMapping("reg")
	public Result reg(@Valid SfUser user,Errors errors,String repwd) {
		try {
			if(errors.hasFieldErrors()){
				return new  Result(1,"用户注册失败!",errors.getFieldErrors());
			}
			ubiz.reg(user,repwd);
			return new Result(0,"用户注册成功!");
		} catch (BizException e) {
			e.printStackTrace();
			// 拒绝输入值
			errors.rejectValue(e.getName(),"" + e.getCode(), e.getMessage());;
			return new Result(e.getCode(),"用户注册失败!",errors.getFieldErrors());
		}
	}
}
