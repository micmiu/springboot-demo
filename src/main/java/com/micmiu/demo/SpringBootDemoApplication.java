package com.micmiu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//ServletComponentScan 用于注解 WebFilter 和 WebServlet生效
//@ServletComponentScan
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
//		SpringApplication springApplication = new SpringApplication(SbmDemoApplication.class);
//		springApplication.setBannerMode(Banner.Mode.OFF);
//		springApplication.run(args);
	}
}
