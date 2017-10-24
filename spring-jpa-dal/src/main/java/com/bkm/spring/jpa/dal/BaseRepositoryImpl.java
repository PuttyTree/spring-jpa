package com.bkm.spring.jpa.dal;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * JPA 查询接口实现
 *
 * Created by jian.wan on 2017/9/5.
 */
@NoRepositoryBean
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T,ID> implements BaseRepository<T, ID> {

    private EntityManager em;


    public BaseRepositoryImpl(JpaEntityInformation<T, ?> jpaEntityInformation, EntityManager em) {
        super(jpaEntityInformation, em);
        this.em = em;
    }

    public BaseRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.em = em;
    }

    /*
     * (non-Javadoc)
     * @see com.crunii.uie.core.data.UpdateRepository#update(java.lang.Object, java.lang.String[])
     */
/*
    @Transactional
    public T updateAttributes(ID id, T entity, String... attributes) {
        if (attributes == null || attributes.length == 0) {
            em.merge(entity);

            return entity;
        } else {
            Object obj = em.find(entity.getClass(),id);
           // T p = em.find(super.getDomainClass(), id);
            BeanUtil.copyPermittedProperties(entity, obj, attributes);
            return (T)obj;
        }
    }
*/

	public void detach(Object entity) {
		em.detach(entity);
	}

}
