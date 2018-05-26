package com.bkm.spring.jpa.controller;

import com.bkm.spring.jpa.common.exception.ErrorCode;
import com.bkm.spring.jpa.dal.entity.UsersEntity;
import com.bkm.spring.jpa.service.UsersService;
import com.bkm.spring.jpa.service.request.UsersQuery;
import com.bkm.spring.jpa.service.vo.base.PageResultWrapper;
import com.bkm.spring.jpa.service.vo.base.RestResponse;
import com.bkm.spring.jpa.service.vo.users.UserSimpleVo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by yongli.chen on 2017/10/1.
 *
 * @author yongli.chen
 * @description 用户controller
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UsersService usersService;

    @Resource
    private CounterService counterService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        counterService.increment("LoginController.hello.count");
        logger.info("CurrentThread={}",Thread.currentThread().getName());
        return "Hello ";
    }

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = {""}, method = RequestMethod.POST)
    public List<UsersEntity> getUserList() {
        List<UsersEntity> r = new ArrayList<UsersEntity>();
        return r;
    }

/*	@ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
	@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "UsersEntity")
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String postUser(@RequestBody UsersEntity user) {
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
