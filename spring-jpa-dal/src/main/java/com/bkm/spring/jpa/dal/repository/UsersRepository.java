package com.bkm.spring.jpa.dal.repository;


import com.bkm.spring.jpa.dal.BaseRepository;
import com.bkm.spring.jpa.dal.entity.UsersEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**

 */
public interface UsersRepository extends BaseRepository<UsersEntity, Long> {

	/*List<UsersEntity> findByRetailerIdAndTaskStatus(String retailerId);
*/
//	List<UsersEntity> findById(String id);
	/**
	 * 根据申请单号，查询任务
	 */
	@Query("select t from UsersEntity  t where t.id=:id")
	UsersEntity findById(@Param("id") String id);

}
