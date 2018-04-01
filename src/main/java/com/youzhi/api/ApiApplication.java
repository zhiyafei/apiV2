package com.youzhi.api;

import demo.sso.client.SSOFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean ssoClient() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new SSOFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("serverBaseUrl", "http://localhost:8088");
		registration.addInitParameter("serverInnerAddress", "http://localhost:8088");
		registration.addInitParameter("excludes", "^\\/public\\/.*$");
		registration.setName("ssoClient");
		return registration;
	}
}
