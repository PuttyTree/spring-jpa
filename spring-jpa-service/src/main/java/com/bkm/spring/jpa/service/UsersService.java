package com.bkm.spring.jpa.service;

import com.bkm.spring.jpa.dal.biz.UsersBiz;
import com.bkm.spring.jpa.dal.entity.Users;
import com.bkm.spring.jpa.service.helper.UsersHelper;
import com.bkm.spring.jpa.service.request.UsersQuery;
import com.bkm.spring.jpa.service.vo.base.PageResultWrapper;
import com.bkm.spring.jpa.service.vo.users.UserSimpleVo;
import com.mysema.query.SearchResults;
import com.mysema.query.types.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yongli.chen on 2017/10/1.
 */
@Service
public class UsersService {
	private final static Logger logger = LoggerFactory.getLogger(UsersService.class);

	@Resource
	private UsersBiz usersBiz;

	public PageResultWrapper<UserSimpleVo> list(UsersQuery query, String user) {

		List<Predicate> predicates = UsersHelper.toPredicateCondition(query, user);
		SearchResults<Users> listResults = usersBiz.listPosRetailerPage(predicates, query.getPageNo(), query.getPageSize());

		PageResultWrapper<UserSimpleVo> result = UsersHelper.toUserSimpleVoPage(listResults, query.getPageNo() - 1, query.getPageSize());
	/*	if (result.getRows() != null && !result.getRows().isEmpty()) {
			for (UserSimpleVo vo : result.getRows()) {
				// 查询每个商户下面对应的未被领取的门店任务
				vo.setUnfinishedPosTaskCount(taskPosBiz.getUnfinishedPosTaskCount(vo.getRetailerId()));
			}
		}*/
		return result;
	}
}
