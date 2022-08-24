package com.buu.bcs;

import com.buu.bcs.configuration.ApplicationConfiguration;
import com.buu.bcs.configuration.EndpointConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BreastCencerSystemApplication {

	@Autowired
	private ApplicationConfiguration applicationConfiguration;

	@Value("${app.build.time}")
	private String buildTime;

	private static final Logger logger = LogManager.getLogger(BreastCencerSystemApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BreastCencerSystemApplication.class, args);
	}

	@PostConstruct
	private void initialize() {
		ApplicationConfiguration.getInstance();
		ApplicationConfiguration.setInstance(this.applicationConfiguration);
		EndpointConfiguration.getInstance().config(this.applicationConfiguration);
		logger.info("Application Built at : {}", this.buildTime);
		logger.info("Server listening port: {}", ApplicationConfiguration.getInstance().getServerPort());
	}



}
