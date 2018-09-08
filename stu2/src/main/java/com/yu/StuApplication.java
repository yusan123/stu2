package com.yu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.yu.mapper")
public class StuApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuApplication.class, args);
	}

	/*@Controller
	class indexController{
		@RequestMapping("/index")
		public Object index(){
			return "index.html";
		}
	}*/
}
