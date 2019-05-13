package com.king.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient // 配置客户端
@RestController // 配置为controller
public class ClientApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(ClientApp2Application.class, args);
	}
	
	@Value("${server.port}") // 读取配置文件的端口
	String port;
	
	/**
	 * 设置一个方法
	 * 参数什么的 可以用HttpServletRequest  也可以用 @RequestParam
	 * 测试我就不添加了
	 * @return
	 */
	@RequestMapping(value="/test")
	public String testMethod() { 
		return "Hello World!!! ====2222===端口为:" + port;
	}

}
