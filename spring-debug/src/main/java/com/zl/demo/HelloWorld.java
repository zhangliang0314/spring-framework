package com.zl.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhangliangx
 * @Date: 2020/11/6 14:32
 * @Description:
 */
public class HelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		User user = (User) context.getBean("user");
		user.setName("123");
		System.out.println(user.getName());

	}
}
