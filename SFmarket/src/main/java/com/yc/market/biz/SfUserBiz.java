package com.yc.market.biz;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.yc.market.biz.BizException;
import com.yc.market.bean.SfUser;
import com.yc.market.bean.SfUserExample;
import com.yc.market.dao.SfUserMapper;
@Service
public class SfUserBiz {

	@Resource
	SfUserMapper um;
	/**
	 * 用户通过 邮箱  电话  或  账号登陆
	 * 
	 * */
	public SfUser login(SfUser u) throws BizException {
		SfUserExample ue = new SfUserExample();
		
		ue.createCriteria().andLoginnameEqualTo(u.getLoginname())
		.andPasswordEqualTo(u.getPassword()).andUtypeEqualTo(u.getUtype());
		
		/*
		 * ube.or().andLoginnameEqualTo(ub.getEmail())
		 * .andPasswordEqualTo(ub.getPassword()).andUtypeEqualTo(ub.getUtype());
		 * 
		 * ube.or().andLoginnameEqualTo(ub.getMobile())
		 * .andPasswordEqualTo(ub.getPassword()).andUtypeEqualTo(ub.getUtype());
		 */
		
		List<SfUser> list = um.selectByExample(ue);
		System.out.println("chaxunjieguo  = " + list);
		if(list.size()!=1) {
			throw new BizException("用户名或密码不正确");
		}else if(list.size() > 1){
			throw new BizException("存在多个相同的账号信息，请更换其他登录字段");
		}else{
			return list.get(0);
		}
	}
	/**
	 * 用户注册
	 * @throws BizException 
	 * */
	public void reg(@Valid SfUser user, String repwd) throws BizException {
		SfUserExample ue = new SfUserExample();
		ue.createCriteria().andLoginnameEqualTo(user.getLoginname());
		
		if(user.getPassword().equals(repwd) == false) {
			throw new BizException(100,"pwd","两次输入的密码不一致");
		}
		
		if(um.countByExample(ue) > 0) {
			throw new BizException(101,"loginname","该用户已经被注册");
		}
		um.insert(user);
	}

}
