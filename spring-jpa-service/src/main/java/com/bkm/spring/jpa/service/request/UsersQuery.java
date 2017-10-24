package com.bkm.spring.jpa.service.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yongli.chen on 2017/10/1.
 */
@ApiModel("用户搜索条件")
public class UsersQuery extends PageQuery {

	@ApiModelProperty(value = "用户名称")
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
