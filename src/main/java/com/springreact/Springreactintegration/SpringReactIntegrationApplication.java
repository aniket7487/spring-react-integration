package com.springreact.Springreactintegration;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactIntegrationApplication {
	
	private static final Logger logger=LogManager.getLogger(SpringReactIntegrationApplication.class);

	static {
		logger.info("Inside Static block.");
		LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
		File file = new File("path/to/a/different/log4j2.xml");

		// this will force a reconfiguration
		context.setConfigLocation(file.toURI());
	}
	public static void main(String[] args) {
		logger.info("Starting application");
		SpringApplication.run(SpringReactIntegrationApplication.class, args);
	}

}
