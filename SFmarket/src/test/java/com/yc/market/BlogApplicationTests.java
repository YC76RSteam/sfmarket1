package com.yc.market;


import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.yc.market.dao.SfProductMapper;


@SpringBootTest
class BlogApplicationTests {
	
	
	  @Resource 
	  private SfProductMapper um;
	  
	  
	  @Test 
	  void test2(){
		  Assert.isTrue(um.selectByExample(null).size() > 0,"结果集数量不正确!"); 
		  System.out.println(um.selectByExample(null)); 
		  
	  }
	 
}

	
	
	


