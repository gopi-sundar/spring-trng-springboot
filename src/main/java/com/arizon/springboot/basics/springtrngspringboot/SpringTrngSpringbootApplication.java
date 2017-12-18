package com.arizon.springboot.basics.springtrngspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTrngSpringbootApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringTrngSpringbootApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringTrngSpringbootApplication.class,
				args);
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			logger.error(beanName);
		}
		
	}
}
