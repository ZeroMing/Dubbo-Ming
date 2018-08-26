package dubbo.common.service;

import java.util.List;

import dubbo.common.req.UserInsertReq;

/**
 * Created by lenovo on 2015/5/11.
 */
public interface HelloService {
	
    public String sayHello(String str);
    
    public boolean saveUser(UserInsertReq user,int bizId);
    
    
    public boolean batchSaveUser(List<UserInsertReq> users,int bizId);
    
    
}
