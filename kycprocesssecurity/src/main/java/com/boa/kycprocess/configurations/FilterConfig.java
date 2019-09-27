package com.boa.kycprocess.configurations;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.kycprocess.filters.KycFilter;

@Configuration
public class FilterConfig {

	// create bean
	// that bean will do the filter config part

	private String urlPattern = "/*";

	@Bean
	public FilterRegistrationBean<KycFilter> register() {
		FilterRegistrationBean<KycFilter> register = new FilterRegistrationBean<KycFilter>();
		KycFilter filter = new KycFilter();
		register.setFilter(filter);
		register.addUrlPatterns(urlPattern);
		return register;

	}

}
