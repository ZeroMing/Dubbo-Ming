package dubbo.consumer.controller;

import dubbo.common.req.UserInsertReq;
import dubbo.common.service.HelloService;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2015/5/11.
 */
@RestController
public class TestController {

    @Autowired
    private HelloService helloService ;

    @RequestMapping("/test")
    public String index(){
        return helloService.sayHello("Bubbo") ;
    }
    
    
    @RequestMapping("/save")
    public String save(UserInsertReq req,HttpServletRequest request){
    	req.setUserName("admin");
    	int bizId = new Random().nextInt();
        helloService.saveUser(req,bizId) ;
        return "1";
    }
}
