package com.boa.kycprocess.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id = "kycbeans")
@Component
public class KycEndPoint {

	@Autowired
	private ApplicationContext context;

	@ReadOperation
	@Bean
	public String[] getAllBeanNames() {
		return this.context.getBeanDefinitionNames() != null ? this.context.getBeanDefinitionNames()
				: this.context.getBeanDefinitionNames();
	}
}
