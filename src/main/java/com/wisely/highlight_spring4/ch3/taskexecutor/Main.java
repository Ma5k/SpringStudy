package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Springͨ������ִ������TaskExecutor����ʵ�ֶ��̺߳Ͳ�����̡�
 * ʹ��ThreadPoolTaskExecutor��ʵ��һ�������̳߳ص�TaskExecutor��
 * ��ʵ�ʿ���������һ���Ƿ��谭�ģ����첽�ģ�
 * ��������Ҫ����������ͨ��@EnableAsync�������첽�����֧�֣�
 * ��ͨ����ʵ��ִ�е�Bean�ķ�����ʹ��@Asyncע������������һ���첽����
 * @author Mask
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		
		for(int i = 0;i < 10;i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
		context.close();
	}
}
