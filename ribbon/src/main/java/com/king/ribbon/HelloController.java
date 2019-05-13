package com.king.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/demo") // 随便起个自己喜欢的访问名字
	public String hi(@RequestParam String name) {
		System.out.println("======================demo");
		return helloService.hiService(name);
	}
}
