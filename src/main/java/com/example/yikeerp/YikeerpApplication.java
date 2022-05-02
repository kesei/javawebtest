package com.example.yikeerp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.yikeerp.dao")
public class YikeerpApplication {

	public static void main(String[] args) {
		SpringApplication.run(YikeerpApplication.class, args);
	}

}
