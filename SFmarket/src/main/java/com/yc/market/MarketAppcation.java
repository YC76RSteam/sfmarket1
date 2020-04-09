package com.yc.market;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//MyBatis 接口组件扫描
@MapperScan("com.yc.market")
public class MarketAppcation {
	public static void main(String[] args) {
		SpringApplication.run(MarketAppcation.class, args);
	}
}