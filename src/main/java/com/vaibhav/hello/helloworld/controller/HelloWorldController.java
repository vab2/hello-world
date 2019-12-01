package com.vaibhav.hello.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.hello.helloworld.dto.HelloWorld;

@RestController
public class HelloWorldController {

	@RequestMapping(path = { "/hello-path", "/hello-path1",
			"/hello-path2" }, method = RequestMethod.GET, produces = "text/plain")
	public String helloWorldRequestMappingPath() {
		return "Request Mapping Path : Hello Mr. Vaibhav";
	}

	@RequestMapping(value = "/hello-value", method = RequestMethod.GET, produces = "application/json")
	public HelloWorld helloWorldRequestMappingValue(@RequestParam String name) {
		return new HelloWorld("Request Mapping value: Hello Mr. " + name);
	}

	@GetMapping(path = "hello-get/{number}")
	public String helloWorldGetMapping(@RequestParam String name, @PathVariable String number) {
		return "Get Mapping: Hello Mr. " + name + " in the universe number " + number;
	}

}
