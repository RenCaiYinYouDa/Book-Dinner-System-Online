package com.rcyyd.test.qihuang;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rcyyd.bookdinner.domain.Address;
import com.rcyyd.bookdinner.service.AddressService;

public class ServiceTest {
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
	
	
	/*@Test
	public void AddrDaotest(){
		AddressService ad=(AddressService)ctx.getBean(AddressService.class);
		Address a =new Address();
		for(int i=0;i<5;i++){
			a.setUserid(1);
			a.setAddress("四川");
			ad.addAddress(a);
		}
	}*/
	
	@Test
	public void deleAllDaotest(){
		AddressService ad=(AddressService)ctx.getBean(AddressService.class);
		List<Address> a=ad.getAllAddress(1);
		for (Address aa: a){
			System.out.println(aa.getAddid());
		}
		
	}
	
}
