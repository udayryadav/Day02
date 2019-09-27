package com.boa.kycprocess.configurations;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class NoSQLConfiguration implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String type = System.getProperty("dbType");
		return (type != null && type.equalsIgnoreCase("MONGODB"));
	}

}
