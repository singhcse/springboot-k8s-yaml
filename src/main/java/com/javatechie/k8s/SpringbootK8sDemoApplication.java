package com.javatechie.k8s;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	private final Log logger = LogFactory.getLog(getClass());

	@GetMapping("/scheduler")
	public String displayMessage(){
		logger.info("Scheduler starting at :::::::::::" + System.currentTimeMillis());
		return "This api is working as a demo scheduler";

    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
