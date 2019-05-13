package com.king.feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class ClientNameController {
	@Autowired
	SchedualCilentName schedualCilentName;
    // controller中的value值不做要求  随便写
    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String sayHi(){
    	System.out.println("------------------------");
        return schedualCilentName.sayHiFromClientOne();
    }
}
