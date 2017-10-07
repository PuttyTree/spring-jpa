package com.bkm.spring.jpa.dal;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 数据层测试基类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestDalMain.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class BaseDalTest {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @PersistenceContext
    protected EntityManager em;
}
