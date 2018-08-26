package dubbo.provider.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import dubbo.common.req.UserInsertReq;
import dubbo.common.service.HelloService;

/**
 * Created by lenovo on 2015/5/11.
 */
@Service
public class HelloServiceImpl implements HelloService {
	
	
    @Override
    public String sayHello(String str) {
       return "Hello "+str;
    }

    
    
	@Override
	public boolean saveUser(UserInsertReq user, int bizId) {
		System.out.println("save user");
		return true;
	}


	@Override
	public boolean batchSaveUser(List<UserInsertReq> users, int bizId) {
		System.out.println("batch save users");
		return false;
	}
}
