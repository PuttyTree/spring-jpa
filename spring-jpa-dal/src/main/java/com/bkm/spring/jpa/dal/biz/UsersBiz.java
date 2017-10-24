package com.bkm.spring.jpa.dal.biz;

import com.bkm.spring.jpa.dal.dsl.QUsersEntity;
import com.bkm.spring.jpa.dal.entity.UsersEntity;
import com.bkm.spring.jpa.dal.repository.UsersRepository;
import com.mysema.query.SearchResults;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by yongli.chen on 2017/10/1.
 */
@Component
public class UsersBiz {
	@Autowired
	private EntityManager entityManager;

	@Resource
	private UsersRepository usersRepository;

	/**
	 * 根据查询条件 获取门店任务 分页列表
	 *
	 * @param predicates 查询条件
	 * @param pageNo     分页编号
	 * @param pageSize   分页大小
	 * @return
	 */
	public SearchResults<UsersEntity> listPosRetailerPage(List<Predicate> predicates, int pageNo, int pageSize) {
		QUsersEntity qUsersEntity = QUsersEntity.usersEntity;
		JPAQuery jpaQuery = new JPAQuery(entityManager);

//		Predicate[] pts = (Predicate[]) predicates.toArray();
//		return jpaQuery.from(qTaskRetailer).where(pts).offset((pageNo - 1) * pageSize)
//			.limit(pageSize).listResults(qTaskRetailer);
		return jpaQuery.from(qUsersEntity).offset((pageNo - 1) * pageSize)
			.limit(pageSize).listResults(qUsersEntity);
	}

}
