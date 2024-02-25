package com.stl.spring_constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.DemoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	DemoService demoService = (DemoService) context.getBean("demoService");
    	demoService.getDetails();
    }
}
