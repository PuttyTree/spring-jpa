package com.bkm.spring.jpa.service.vo.users;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yongli.chen on 2017/10/1.
 */
@ApiModel("用户对象")
public class UserSimpleVo {
	@ApiModelProperty("用户的id")
	private Long id;

	@ApiModelProperty("用户的姓名")
	private String userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
