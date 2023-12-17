package com.test.SpringBootOnlinn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@GetMapping("/hai")
	public String hai()
	{
		return "Welcome to springboot application !";
	}

}
