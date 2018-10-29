package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBean.class);
    	System.out.println(context.getBean(MyBean.class));
    	System.out.println(context.getBean("myBean"));
    	//System.out.println(context.getBean(Jeep.class));
    	context.close();
    }
}
