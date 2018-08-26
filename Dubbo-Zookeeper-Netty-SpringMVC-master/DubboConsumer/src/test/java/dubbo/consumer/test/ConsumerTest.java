package dubbo.consumer.test;

import dubbo.common.req.UserInsertReq;
import dubbo.common.service.HelloService;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lenovo on 2015/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-consumer.xml")
public class ConsumerTest {
    @Autowired
    private HelloService helloService ;

    @Test
    public void test(){
        System.out.println(helloService.sayHello("test"));
    }
    
    
    @Test
    public void testSave(){
        UserInsertReq user = new UserInsertReq();
        user.setId(1);
        user.setSex("女");
        user.setUserName("李明");
		int bizId = 11;
		System.out.println(helloService.saveUser(user, bizId ))  ;
    }
    
    
    
    @Test
    public void testBatchSave(){
    	List<UserInsertReq> users = new ArrayList<>();
        UserInsertReq user = new UserInsertReq();
        user.setId(1);
        user.setSex("女");
        user.setUserName("李明");
        users.add(user);
		int bizId = 11;
		System.out.println(helloService.saveUser(user, bizId ))  ;
    }

}
