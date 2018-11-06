package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 1��@Conditionalע���������ĳһ���ض���������һ���ض���Bean��
 * ����˵����ĳһ��jar����һ����·���µ�ʱ���Զ�����һ������Bean��
 * ����ֻ��ĳ��Bean�������Żᴴ������һ��Bean���ܵ���˵��
 * ���Ǹ����ض�����������Bean�Ĵ�����Ϊ���������ǿ�������������Խ���һЩ�Զ������á�
 * @author Mask
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService listService = context.getBean(ListService.class);
		
		System.out.println(context.getEnvironment().getProperty("os.name")
				+ "ϵͳ�µ��б�����Ϊ��"
				+ listService.showListCmd());
	}
}
