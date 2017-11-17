package com.loki.server.test;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.loki.server.model.User;
import com.loki.server.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:/configs/spring-mybatis.xml"})
public class TestMyBatis {
	
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
    @Resource
    private UserService userService;


    @Test
    public void test1() {
        User user = userService.findById(6);
        logger.info(JSON.toJSONString(user));
    }
    
//    @Test
//    public void testCache2() {
//    	User user = userService.findById(5);
//        logger.info(JSON.toJSONString(user));
//
//        try {
//        	user.setUserName("lokizero00");
//        	userService.update(user);
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        User user1 = userService.findById(5);
//        logger.info(JSON.toJSONString(user1));
//
//        User user2 = userService.findById(5);
//        logger.info(JSON.toJSONString(user2));
//    }   
}

