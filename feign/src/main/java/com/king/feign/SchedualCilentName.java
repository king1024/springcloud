package com.king.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "kingClient")
public interface SchedualCilentName {

		// value值必须与discSystem-4、discSystem-4-1中方法名一致
		@RequestMapping(value = "/test",method = RequestMethod.GET)
		String sayHiFromClientOne();
}
