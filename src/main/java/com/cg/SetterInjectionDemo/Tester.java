package com.cg.SetterInjectionDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("shpingcartconfig.xml");
		ShoppingCart cart=(ShoppingCart) context.getBean("shoppingcart");
		
		System.out.println(cart);
		System.out.println(cart.getItem());
	}

}
