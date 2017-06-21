package com.rcyyd.test.ruizhou;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rcyyd.bookdinner.domain.ComUser;
import com.rcyyd.bookdinner.persistence.ComUserDao;
import com.rcyyd.bookdinner.persistence.impl.ComUserDaoImpl;
import com.rcyyd.bookdinner.service.ComUserService;


public class Test_zr {
	
private static ApplicationContext ctx = null;		// IoC容器(管理对象及对象依赖关系的工厂)
	
	@BeforeClass
	public static void setUpBeforeClass() {
		ctx = new ClassPathXmlApplicationContext("app.xml");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		if (ctx instanceof ClassPathXmlApplicationContext) {
			((ClassPathXmlApplicationContext) ctx).destroy();
		}
	}
	
	@Test
	public void UserTest(){
		ComUserService cs = (ComUserService)ctx.getBean(ComUserService.class);
		ComUser user = new ComUser();
		user.setUsername("aa");
		user.setPassword("aa");
		user.setEmail("aa");
		user.setKey("aa");
//		ComUserDao dao = new ComUserDaoImpl();
		cs.register(user);
		System.out.println("aa");
	}
	
}
