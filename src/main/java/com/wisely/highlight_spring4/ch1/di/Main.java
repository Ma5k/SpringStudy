package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 1��ʹ��AnnotationConfigApplicationContext��Ϊspring��������������һ����������Ϊ����
 * 2������������õ�UseFunctionService��bean
 * @author Mask
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.SayHello("di"));
		context.close();
	}
}
