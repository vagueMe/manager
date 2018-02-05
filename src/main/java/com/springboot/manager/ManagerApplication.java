package com.springboot.manager;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class ManagerApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(ManagerApplication.class, args);
	}


	/*public static void main(String[] args) throws Exception {
		SpringApplication.run(TestBootController.class, args);
	}*/
}
