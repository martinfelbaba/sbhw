package com.mf.sbhw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	/**
	 * Usage: http://localhost:8080/hello?name=<<name>>
	 * 
	 * @param name
	 * @return
	 */
    @GetMapping("/hello")
    public String helloWorld(@RequestParam final String name) {
        return "Hello, " + name + ".\n";
    }
}
