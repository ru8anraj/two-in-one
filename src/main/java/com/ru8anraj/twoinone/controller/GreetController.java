package com.ru8anraj.twoinone.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ru8anraj.twoinone.modal.Greet;

@RestController
public class GreetController {
	
	private AtomicLong id = new AtomicLong();
	private String template = "Hello, %S!";
	
	@GetMapping("/greet")
	public @ResponseBody
	Greet greetUser(
			@RequestParam(value="name", defaultValue="World") String name
	) {
		return new Greet(id.incrementAndGet(), String.format(template, name));
	}
}
