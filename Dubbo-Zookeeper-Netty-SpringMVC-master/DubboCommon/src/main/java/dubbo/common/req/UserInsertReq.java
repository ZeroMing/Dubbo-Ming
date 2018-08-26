package dubbo.common.req;

import java.io.Serializable;

public class UserInsertReq implements Serializable{

	private static final long serialVersionUID = -5230785240554001393L;
	
	private int id;
	private String userName;
	
	private String sex;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
