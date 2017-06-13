package com.performgroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TickTockApplication {

	public static void main(String[] args) {
		SpringApplication.run(TickTockApplication.class, args);
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping("{asset}")
	public void tickTock(@PathVariable String asset) {
		System.out.println(asset);
	}
}