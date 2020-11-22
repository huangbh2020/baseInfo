package com.toone.baseInfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.toone.baseInfo.business.mapping")
public class BaseInfoApplication {
	public static void main(String[] args) {
		SpringApplication.run(BaseInfoApplication.class, args);
	}
}
