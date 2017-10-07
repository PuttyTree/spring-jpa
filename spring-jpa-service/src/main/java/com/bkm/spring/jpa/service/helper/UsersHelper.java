package com.bkm.spring.jpa.service.helper;

import com.bkm.spring.jpa.dal.dsl.QUsers;
import com.bkm.spring.jpa.dal.entity.Users;
import com.bkm.spring.jpa.service.request.UsersQuery;
import com.bkm.spring.jpa.service.vo.base.PageResultWrapper;
import com.bkm.spring.jpa.service.vo.users.UserSimpleVo;
import com.mysema.query.SearchResults;
import com.mysema.query.types.Predicate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yongli.chen on 2017/10/1.
 */
public class UsersHelper {
	public static List<Predicate> toPredicateCondition(UsersQuery query, String user) {
		QUsers qTaskRetailer = QUsers.users;

		List<Predicate> predicates = new ArrayList<>();

		return predicates;
	}

	/**
	 * 将查询结果 封装成分页结果
	 *
	 * @param pageResult 分页查询结果
	 * @param pageNo     页码
	 * @param pageSize   页大小
	 * @return
	 */
	public static PageResultWrapper<UserSimpleVo> toUserSimpleVoPage(
		SearchResults<Users> pageResult, int pageNo, int pageSize) {
		PageResultWrapper<UserSimpleVo> pageResultWrapper = new PageResultWrapper<>();
		pageResultWrapper.setPageNo(pageNo);
		pageResultWrapper.setPageSize(pageSize);
		if (pageResult == null || pageResult.getResults() == null)
			return pageResultWrapper;
		List<UserSimpleVo> postRetailerTaskList = toUserSimpleVoList(pageResult.getResults());
		pageResultWrapper.setTotal(pageResult.getTotal());
		//	pageResultWrapper.setRows(postRetailerTaskList);
		return pageResultWrapper;
	}

	/**
	 * 将数据库中的 TaskRetailerEntity列表 转换成 页面列表显示对象列表
	 *
	 * @param entityList 任务列表
	 * @return
	 */
	public static List<UserSimpleVo> toUserSimpleVoList(List<Users> entityList) {
		if (entityList == null)
			return null;
		List<UserSimpleVo> voList = new LinkedList<>();
		for (Users entity : entityList) {
			voList.add(toUserskSimpleVo(entity));
		}
		return voList;
	}

	/**
	 * 将数据库中的 商户任务对象 转换成页面对象
	 *
	 * @param entity
	 * @return
	 */
	public static UserSimpleVo toUserskSimpleVo(Users entity) {
		UserSimpleVo vo = new UserSimpleVo();
		vo.setId(entity.getId());
		// vo.setUnclaimedPosTasks(null);
		return vo;
	}

}
