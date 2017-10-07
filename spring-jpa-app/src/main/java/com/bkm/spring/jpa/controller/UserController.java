package com.bkm.spring.jpa.controller;

import com.bkm.spring.jpa.dal.entity.Users;
import com.bkm.spring.jpa.service.UsersService;
import com.bkm.spring.jpa.service.request.UsersQuery;
import com.bkm.spring.jpa.service.vo.base.PageResultWrapper;
import com.bkm.spring.jpa.service.vo.base.RestResponse;
import com.bkm.spring.jpa.service.vo.users.UserSimpleVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yongli.chen on 2017/10/1.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	UsersService usersService;

	@ApiOperation(value = "获取用户列表", notes = "")
	@RequestMapping(value = {""}, method = RequestMethod.POST)
	public List<Users> getUserList() {
		List<Users> r = new ArrayList<Users>();
		return r;
	}

/*	@ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
	@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "Users")
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String postUser(@RequestBody Users user) {
		return "success";
	}*/

	@Transactional
	@PostMapping("/list")
	@ApiOperation(httpMethod = "POST", value = "门店任务列表查询")
	public RestResponse<PageResultWrapper<UserSimpleVo>> list(@RequestBody UsersQuery query)
		throws ParseException {
		return RestResponse.success(usersService.list(query, null));
	}
}
