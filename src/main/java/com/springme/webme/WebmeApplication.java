package com.springme.webme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebmeApplication.class, args);
	}

	@RequestMapping("/")
    public String home() 
	{
    	return "Hello Docker World - Abdul";
    }

}
