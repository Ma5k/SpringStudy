package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ��Spring3.1��ʼ���ƻ�������Spring�е�ʵ�ֱ���쳣�ļ򵥡�
 * ����ͨ����������ע��@EnableScheduling�������Լƻ������֧�֣�
 * Ȼ����Ҫִ�мƻ�����ķ�����ע��@Scheduled����������һ���ƻ�����
 * Springͨ��@Scheduled֧�ֶ������͵ļƻ����񣬰���cron��fixDelay��fixRate�ȡ�
 * @author Mask
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
	}
}
