package com.jsipders.set_type;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsipders/set_type/config.xml"); 
		
		Employee emp =(Employee) context.getBean("employee");
		
		System.out.println(emp);

	}

}
