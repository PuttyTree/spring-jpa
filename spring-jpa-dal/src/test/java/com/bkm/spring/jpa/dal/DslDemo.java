package com.bkm.spring.jpa.dal;

import com.bkm.spring.jpa.dal.dsl.QUsers;
import com.bkm.spring.jpa.dal.entity.Users;
import com.mysema.query.jpa.impl.JPAQuery;
import org.junit.Test;

import java.util.List;

public class DslDemo extends BaseDalTest {

	@Test
	public void testNative() {
		//根据User实体中定义的命名查询
		List<Users> users = em.createNamedQuery("Users.findAll").getResultList();
		//支持原生sql查询
		users = em.createNativeQuery("select * from sys_users").getResultList();
		//logger.info("数量为{}", users);
	}

	@Test
	public void testDsl() {
		JPAQuery query = new JPAQuery(em);
		QUsers qUsers = QUsers.users;
		List<Users> o = query.from(qUsers)
			.where(qUsers.userName.eq("zhangsan"))
			.list(QUsers.users);
	}
}
